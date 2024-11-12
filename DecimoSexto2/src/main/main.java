/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import control.FornecedorController;
import control.ProdutoController;
import control.UsuarioController;
import model.DAO;
import model.FornecedorDAO;
import model.FornecedorDAO_old;
import model.ProdutoDAO;
import model.ProdutoDAO_old;
import model.UsuarioDAO;
import model.UsuarioDAO_old;
import view.FornecedorView;
import view.ProdutoView;
import view.UsuarioView;

/**
 *
 * @author Aluno
 */
public class main {
      public static void main(String[] args) {
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       ProdutoDAO produtoDAO = new ProdutoDAO();
       FornecedorDAO fornecedorDAO = new FornecedorDAO();
       FornecedorController fornecedorController = new FornecedorController(fornecedorDAO);
       ProdutoController produtoController = new ProdutoController(produtoDAO);
       UsuarioController usuarioController = new UsuarioController(usuarioDAO);
       FornecedorView fornecedorView = new FornecedorView(fornecedorController);
       UsuarioView usuarioView = new UsuarioView(usuarioController);
       ProdutoView produtoView = new ProdutoView(produtoController);
       
       //usuarioView.showMenu();
       
      produtoView.showMenu();
      //fornecedorView.showMenu();
      
      
      //DAO.getConnection();
    }
    
}
