/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Optional;

/**
 *
 * @author Aluno
 */
public class ProdutoDAO {

    public void cadastrar(String nome, double valor) {
        String sql = "INSERT INTO produto (nome,valor) VALUES (?,?)";

        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, valor);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Produto> getAll() {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT id,nome,valor FROM produto";
        try (
                Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));

                produtos.add(p);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return produtos;
    }

    public Optional<Produto> getById(int id) {
        String sql = "SELECT id, nome, valor FROM produto WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));

                return Optional.of(p);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Optional.empty();
    }

    public ArrayList<Produto> getByName(String nome) {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT id,nome,valor FROM produto WHERE nome LIKE(?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;

    }

    public ArrayList<Produto> getByValor(double valor, boolean maior) {
        ArrayList<Produto> produtos = new ArrayList();
        String sql;
        if (maior) {
            sql = "SELECT id,nome,valor FROM produto WHERE valor > ?";
        } else {
            sql = "SELECT id,nome,valor FROM produto WHERE valor < ?";
        }
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, valor);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }

    public ArrayList<Produto> getByValor(double valorMenor, double valorMaior) {
        ArrayList<Produto> produtos = new ArrayList();
        String sql = "SELECT id,nome,valor FROM produto WHERE valor BETWEEN ? and ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, valorMenor);
            stmt.setDouble(2, valorMaior);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean update(int id, String nome, double valor) {
        String sql = "UPDATE produto SET nome = ?,valor =? WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, valor);
            stmt.setInt(3, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
