/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.ProdutoController;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import model.Produto;

/**
 *
 * @author Aluno
 */
public class ProdutoView {

    private ProdutoController produtoController;

    public ProdutoView(ProdutoController produtoController) {
        this.produtoController = produtoController;
    }

    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Preco:");
        double valor = teclado.nextDouble();

        produtoController.cadastrar(nome, valor);

        System.out.println("Produto cadastrado!");
    }

    public void listarTodos() {
        for (Produto p : produtoController.getAll()) {
            System.out.print("ID: ");
            System.out.print(p.getId() + "\t");
            System.out.print("Nome: ");
            System.out.print(p.getNome() + "\t");
            System.out.print("Preco: R$");
            System.out.println(p.getValor());
        }
    }

    public void listarPorId() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Produto> pd = produtoController.getById(id);
        pd.ifPresentOrElse(p -> System.out.println(
                "ID: " + p.getId() + "\tNome: " + p.getNome() + "\tPreco: R$" + p.getValor()),
                () -> System.out.println("Produto nao encontrado")
        );
    }

    public void listarPorNome() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        ArrayList<Produto> resposta = produtoController.getByName(nome);
        if (resposta.isEmpty()) {
            System.out.println("Nenhum produto encontrado");
        } else {
            for (Produto p : resposta) {
                System.out.println(
                        "ID: " + p.getId()
                        + "\tNome: " + p.getNome()
                        + "\tPreco: R$" + p.getValor());
            }
        }
    }

    public void listarPorPreco() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual opcao de busca voce quer?");
        System.out.println("1-Selecionar um produto com o preco maior que o escolhido");
        System.out.println("2-Selecionar um produto com o preco menor que o escolhido");
        System.out.println("3-Selecionar um produto entre dois valores escolhidos\n");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1 -> {
                boolean maior = true;
                System.out.println("Qual preco minimo?");
                double preco = teclado.nextDouble();
                ArrayList<Produto> resposta = produtoController.getByValor(preco, maior);
                if (resposta.isEmpty()) {
                    System.out.println("Nenhum produto encontrado");
                } else {
                    for (Produto p : resposta) {
                        System.out.println("ID: " + p.getId() + "\tNome: " + p.getNome() + "\tPreco: R$" + p.getValor());
                    }
                }
            }

            case 2 -> {
                boolean maior = false;
                System.out.println("Qual preco maximo?");
                double preco = teclado.nextDouble();
                ArrayList<Produto> resposta = produtoController.getByValor(preco, maior);
                if (resposta.isEmpty()) {
                    System.out.println("Nenhum produto encontrado");
                } else {
                    for (Produto p : resposta) {
                        System.out.println("ID: " + p.getId() + "\tNome: " + p.getNome() + "\tPreco: R$" + p.getValor());
                    }
                }
            }
            case 3 -> {
                System.out.println("Qual preco minimo?");
                double precoMin = teclado.nextDouble();
                System.out.println("Qual preco maximo?");
                double precoMax = teclado.nextDouble();
                ArrayList<Produto> resposta = produtoController.getByValor(precoMin, precoMax);
                if (resposta.isEmpty()) {
                    System.out.println("Nenhum produto encontrado");
                } else {
                    for (Produto p : resposta) {
                        System.out.println("ID: " + p.getId() + "\tNome: " + p.getNome() + "\tPreco: R$" + p.getValor());
                    }
                }
            }
            default ->
                System.out.println("Opcao Invalida");
        }

    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID de produto que deseja remover: ");
        int id = teclado.nextInt();
        if (produtoController.delete(id)) {
            System.out.println("Produto excluido com sucesso");
        } else {
            System.out.println("Produto nao encontrado");
        }
    }

    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Preco: ");
        double valor = teclado.nextDouble();

        if (produtoController.update(id, nome, valor)) {
            System.out.println("Produto Atualizado");
        } else {
            System.out.println("Produto nao Encontrado");
        }
    }
    
    public void showMenu() {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nGestao De Produtos\n");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Listar todos os Produtos");
            System.out.println("3-Localizar produto por codigo");
            System.out.println("4-Localizar produto por nome");
            System.out.println("5-Localizar produto por preco");
            System.out.println("6-Alterar dados de um produto");
            System.out.println("7-Excluir produto");
            System.out.println("8-Sair\n");
            System.out.print("Opcao: ");
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1 -> cadastrar();
                case 2 -> listarTodos();
                case 3 -> listarPorId();
                case 4 -> listarPorNome();
                case 5 -> listarPorPreco();
                case 6 -> update();
                case 7 -> delete();
                case 8 -> System.exit(0);
                default -> System.out.println("Opcao Invalida");
            }
        }
    }

}
