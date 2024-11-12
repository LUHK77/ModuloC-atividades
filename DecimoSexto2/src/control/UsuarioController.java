/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Optional;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Aluno
 */
public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public void add(String nome, String usuario, String senha) {
        usuarioDAO.add(nome, usuario, senha);
    }

    public ArrayList<Usuario> getAll() {
        return usuarioDAO.getAll();
    }

    public Optional<Usuario> getById(int id) {
        return usuarioDAO.getById(id);
    }

    public ArrayList<Usuario> getByName(String nome) {
        return usuarioDAO.getByName(nome);
    }
    
    public boolean delete(int id){
     return usuarioDAO.delete(id);
    }
    
    public boolean update(int id,String nome, String usuario, String senha){
     return usuarioDAO.update(id, nome, usuario, senha);
    }

}
