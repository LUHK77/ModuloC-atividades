/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author Aluno
 */
public class ProdutoController {
    
    private ProdutoDAO produtoDAO;

    public ProdutoController(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }
    
    public void cadastrar(String nome,double valor){
       produtoDAO.cadastrar(nome, valor);
    }
    
    public ArrayList<Produto> getAll(){
       return produtoDAO.getAll();
    } 
    
    public Optional<Produto> getById(int id){
      return produtoDAO.getById(id);
    }
    
    public ArrayList<Produto> getByName (String nome){
      return produtoDAO.getByName(nome);
    }
    
    public ArrayList<Produto> getByValor (double valor, boolean maior){
      return produtoDAO.getByValor(valor, maior);
    }
    
    public ArrayList<Produto> getByValor (double valorMenor, double valorMaior){
      return produtoDAO.getByValor(valorMenor, valorMaior);
    }
    
    public boolean delete(int id){
     return produtoDAO.delete(id);
    }
    
    public boolean update(int id,String nome,double valor){
      return produtoDAO.update(id, nome, valor);
    }
}
