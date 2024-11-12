/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Aluno
 */
public class ProdutoDAO_old {

    private static final ArrayList<Produto> produtos = new ArrayList();
    private static int ultimoId = 1;

    public void cadastrar(String nome, double valor) {
        Produto p = new Produto(ultimoId++, nome, valor);
        produtos.add(p);
    }

    public ArrayList<Produto> getAll() {
        return produtos;
    }

    public Optional<Produto> getById(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public ArrayList<Produto> getByName(String nome) {
        ArrayList<Produto> resposta = new ArrayList();
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                resposta.add(p);
            }
        }
        return resposta;
    }

    public boolean delete(int id) {
        return produtos.removeIf(produto -> produto.getId() == id);
    }

    public boolean update(int id, String nome, double valor) {
        Optional<Produto> item = getById(id);
        if (item.isPresent()) {
            Produto produtoNovo = item.get();
            produtoNovo.setNome(nome);
            produtoNovo.setValor(valor);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Produto> getByValor(double valor, boolean maior) {
        ArrayList<Produto> resposta = new ArrayList();
        if (maior) {
            for (Produto p : produtos) {
                if (p.getValor() >= valor) {
                    resposta.add(p);
                }
            }
        } else {
            for (Produto p : produtos) {
                if (p.getValor() <= valor) {
                    resposta.add(p);
                }
            }
        }
        return resposta;
    }

    public ArrayList<Produto> getByValor(double valorMenor, double valorMaior) {
        ArrayList<Produto> resposta = new ArrayList();
        for (Produto p : produtos) {
            if (p.getValor() >= valorMenor && p.getValor() <= valorMaior) {
                resposta.add(p);
            }
        }
        return resposta;
    }
}
