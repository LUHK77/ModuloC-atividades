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
public class UsuarioDAO_old {

    private static ArrayList<Usuario> usuarios = new ArrayList();
    private static int ultimoId = 1;

    public void adcionar(String nome, String usuario, String senha) {
        Usuario u = new Usuario(ultimoId++, nome, usuario, senha);
        usuarios.add(u);
    }

    public ArrayList<Usuario> getAll() {
        return usuarios;
    }

    public Optional<Usuario> getById(int id) {
        return usuarios.stream().filter(u -> u.getId() == id).findFirst();
    }

    public ArrayList<Usuario> getByName(String nome) {
        ArrayList<Usuario> resposta = new ArrayList();
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                resposta.add(u);
            }
        }
        return resposta;
    }

    public boolean delete(int id) {
        return usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    public boolean update(int id, String nome, String usuario, String senha) {
        Optional<Usuario> item = getById(id);
        if (item.isPresent()) {
            Usuario usuarioNovo = item.get();
            usuarioNovo.setNome(nome);
            usuarioNovo.setUsuario(usuario);
            usuarioNovo.setSenha(senha);
            return true;
        } else {
            return false;
        }
    }
}
