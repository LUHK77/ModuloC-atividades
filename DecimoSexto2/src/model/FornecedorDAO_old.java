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
public class FornecedorDAO_old {

    private static final ArrayList<Fornecedor> fornecedores = new ArrayList();
    private static int ultimoId = 1;

    public void cadastrar(String razaoSocial, String nomeFantasia, String cnpj) {
        Fornecedor f = new Fornecedor(ultimoId++, razaoSocial, nomeFantasia, cnpj);
        fornecedores.add(f);
    }

    public ArrayList<Fornecedor> getAll() {
        return fornecedores;
    }

    public Optional<Fornecedor> getById(int id) {
        return fornecedores.stream().filter(f -> f.getId() == id).findFirst();
    }

    public ArrayList<Fornecedor> getBySocialReason(String razaoSocial) {
        ArrayList<Fornecedor> resposta = new ArrayList();
        for (Fornecedor f : fornecedores) {
            if (f.getRazaoSocial().equalsIgnoreCase(razaoSocial)) {
                resposta.add(f);
            }
        }
        return resposta;
    }

    public ArrayList<Fornecedor> getByCnpj(String cnpj) {
        ArrayList<Fornecedor> resposta = new ArrayList();
        for (Fornecedor f : fornecedores) {
            if (f.getCnpj().equals(cnpj)) {
                resposta.add(f);
            }
        }
        return resposta;
    }

    public boolean delete(int id) {
        return fornecedores.removeIf(f -> f.getId() == id);
    }

    public boolean update(int id, String razaoSocial, String nomeFantasia, String cnpj) {
        Optional<Fornecedor> item = getById(id);
        if (item.isPresent()) {
            Fornecedor fornecedorNovo = item.get();
            fornecedorNovo.setRazaoSocial(razaoSocial);
            fornecedorNovo.setNomeFantasia(nomeFantasia);
            fornecedorNovo.setCnpj(cnpj);
            return true;
        } else {
            return false;
        }
    }

}
