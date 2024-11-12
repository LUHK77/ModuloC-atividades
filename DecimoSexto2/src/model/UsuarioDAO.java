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
public class UsuarioDAO {

    public void add(String nome, String usuario, String senha) {
        String sql = "INSERT INTO usuario (nome,usuario,senha) VALUES (?,?,?)";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Usuario> getAll() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "Select id, nome, usuario, senha FROM usuario";
        try (
                Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Usuario u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("usuario"), rs.getString("senha"));

                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    public Optional<Usuario> getById(int id) {
        String sql = "Select id, nome, usuario, senha FROM usuario WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("usuario"), rs.getString("senha"));

                return Optional.of(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public ArrayList<Usuario> getByName(String nome) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "Select id, nome, usuario, senha FROM usuario WHERE nome LIKE(?)";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome+"%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("usuario"), rs.getString("senha"));

                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean update(int id, String nome, String usuario, String senha) {
        String sql = "UPDATE usuario SET nome = ?, usuario = ?, senha = ? WHERE id = ?";
        try (
                Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.setInt(4, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
