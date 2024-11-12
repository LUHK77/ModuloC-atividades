/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.Fornecedor;
import model.FornecedorDAO;

/**
 *
 * @author Aluno
 */
public class FornecedorController {

    private final FornecedorDAO fornecedorDAO;

    public FornecedorController(FornecedorDAO fornecedorDAO) {
        this.fornecedorDAO = fornecedorDAO;
    }

    
    public void cadastrar(String razaoSocial, String nomeFantasia, String cnpj){
     fornecedorDAO.cadastrar(razaoSocial, nomeFantasia, cnpj);
    }
    
    public ArrayList<Fornecedor> getAll() {
        return fornecedorDAO.getAll();
    }
    
     public Optional<Fornecedor> getById(int id) {
        return fornecedorDAO.getById(id);
    }
     
    public ArrayList<Fornecedor> getBySocialReason(String nome) {
        return fornecedorDAO.getBySocialReason(nome);
    }
    
    public ArrayList<Fornecedor> getByCnpj(String cnpj) {
        return fornecedorDAO.getByCnpj(cnpj);
    }
    
    public boolean delete(int id){
     return fornecedorDAO.delete(id);
    }
    
    public boolean update(int id,String razaoSocial, String nomeFantasia, String cnpj) {
       return fornecedorDAO.update(id, razaoSocial, nomeFantasia, cnpj);
    }

}
