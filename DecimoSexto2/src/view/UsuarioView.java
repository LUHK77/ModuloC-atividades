/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.UsuarioController;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class UsuarioView {

    private UsuarioController usuarioController;

    public UsuarioView(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public void add() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Usuario:");
        String usuario = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        usuarioController.add(nome, usuario, senha);

        System.out.println("Usuario salvo");
    }

    public void getAll() {
        for (Usuario u : usuarioController.getAll()) {
            System.out.print("ID: ");
            System.out.print(u.getId() + "\t");
            System.out.print("NOME: ");
            System.out.print(u.getNome() + "\t");
            System.out.print("USUARIO: ");
            System.out.print(u.getUsuario() + "\t");
            System.out.print("SENHA: ");
            System.out.println(u.getSenha());
        }
    }

    public void getById() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Usuario> us = usuarioController.getById(id);
        us.ifPresentOrElse(u -> System.out.println(
                "ID: " + u.getId() + "\tNome:" + u.getNome()),
                () -> System.out.println("Nao encontrado")
        );
    }

    public void getByName() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        ArrayList<Usuario> resposta = usuarioController.getByName(nome);
        if (resposta.isEmpty()) {
            System.out.println("Usuario nao encontrado");
        } else {
            for (Usuario u : resposta) {
                System.out.print("ID: ");
                System.out.print(u.getId() + "\t");
                System.out.print("NOME: ");
                System.out.print(u.getNome() + "\t");
                System.out.print("USUARIO: ");
                System.out.print(u.getUsuario() + "\t");
                System.out.print("SENHA: ");
                System.out.println(u.getSenha());
            }
        }
    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID que deseja remover: ");
        int id = teclado.nextInt();
        if (usuarioController.delete(id)) {
            System.out.println("Usuario excluido com sucesso");
        } else {
            System.out.println("Usuario nao encontrado");
        }
    }

    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        if (usuarioController.update(id, nome, usuario, senha)) {
            System.out.println("Usuario Atualizado");
        } else {
            System.out.println("Usuario nao Encontrado");
        }
    }

    public void showMenu() {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nGestao De Usuarios\n");
            System.out.println("1-Adcionar Usuario");
            System.out.println("2-Listar todos os Usuarios");
            System.out.println("3-Localizar Usuario por codigo");
            System.out.println("4-Localizar Usuario por nome");
            System.out.println("5-Alterar dados de um usuario");
            System.out.println("6-Excluir usuario");
            System.out.println("7-Sair\n");
            System.out.print("Opcao: ");
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1 -> add();
                case 2 -> getAll();
                case 3 -> getById();
                case 4 -> getByName();
                case 5 -> update();
                case 6 -> delete();
                case 7 -> System.exit(0);
                default -> System.out.println("Opcao Invalida");
            }
        }
    }
}
