/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.FornecedorController;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import model.Fornecedor;

/**
 *
 * @author Aluno
 */
public class FornecedorView {

    private FornecedorController fornecedorController;

    public FornecedorView(FornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
    }

    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Razao Social: ");
        String razaoSocial = teclado.nextLine();
        System.out.print("Nome Fantasia:");
        String nomeFantasia = teclado.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = teclado.nextLine();

        fornecedorController.cadastrar(razaoSocial, nomeFantasia, cnpj);

        System.out.println("Cadastro concluido");
    }

    public void getAll() {
        for (Fornecedor f : fornecedorController.getAll()) {
            System.out.print("ID: ");
            System.out.print(f.getId() + "\t");
            System.out.print("Razao Social: ");
            System.out.print(f.getRazaoSocial() + "\t");
            System.out.print("Nome Fantasia: ");
            System.out.print(f.getNomeFantasia() + "\t");
            System.out.print("CNPJ: ");
            System.out.println(f.getCnpj());
        }
    }

    public void getById() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Fornecedor> fs = fornecedorController.getById(id);
        fs.ifPresentOrElse(f -> System.out.println(
                "ID: " + f.getId() + "\tRazao Social:" + f.getRazaoSocial()),
                () -> System.out.println("Nao encontrado")
        );
    }

    public void getBySocialReason() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Razao Social: ");
        String razaoSocial = teclado.nextLine();
        ArrayList<Fornecedor> resposta = fornecedorController.getBySocialReason(razaoSocial);
        if (resposta.isEmpty()) {
            System.out.println("Fornecedor nao encontrado");
        } else {
            for (Fornecedor f : resposta) {
                System.out.print("ID: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Razao Social: ");
                System.out.print(f.getRazaoSocial() + "\t");
                System.out.print("Nome Fantasia: ");
                System.out.print(f.getNomeFantasia() + "\t");
                System.out.print("CNPJ: ");
                System.out.println(f.getCnpj());
            }
        }
    }

    public void getByCnpj() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cnpj: ");
        String cnpj = teclado.nextLine();
        ArrayList<Fornecedor> resposta = fornecedorController.getByCnpj(cnpj);
        if (resposta.isEmpty()) {
            System.out.println("Fornecedor nao encontrado");
        } else {
            for (Fornecedor f : resposta) {
                System.out.print("ID: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Razao Social: ");
                System.out.print(f.getRazaoSocial() + "\t");
                System.out.print("Nome Fantasia: ");
                System.out.print(f.getNomeFantasia() + "\t");
                System.out.print("CNPJ: ");
                System.out.println(f.getCnpj());
            }
        }
    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ID que deseja remover");
        int id = teclado.nextInt();
        if (fornecedorController.delete(id)) {
            System.out.println("Fornecedor excluido");
        } else {
            System.out.println("Fornecedor nao encontrado");
        }
    }

    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Razao Social: ");
        String razaoSocial = teclado.nextLine();
        System.out.print("Nome Fantasia: ");
        String nomeFantasia = teclado.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = teclado.nextLine();

        if (fornecedorController.update(id, razaoSocial, nomeFantasia, cnpj)) {
            System.out.println("Fornecedor Atualizado");
        } else {
            System.out.println("Fornecedor nao encontrado");
        }
    }
    
    public void showMenu() {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nGestao de Fornecedores\n");
            System.out.println("1-Cadastrar fornecedor");
            System.out.println("2-Listar todos os Fornecedores");
            System.out.println("3-Localizar fornecedor por id");
            System.out.println("4-Localizar fornecedor por Razao Social");
            System.out.println("5-Localizar fornecedor por Cnpj");
            System.out.println("6-Alterar dados de um fornecedor");
            System.out.println("7-Excluir fornecedor");
            System.out.println("8-Sair\n");
            System.out.print("Opcao: ");
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1 -> cadastrar();
                case 2 -> getAll();
                case 3 -> getById();
                case 4 -> getBySocialReason();
                case 5 -> getByCnpj();
                case 6 -> update();
                case 7 -> delete();
                case 8 -> System.exit(0);
                default -> System.out.println("Opcao Invalida");
            }
        }
    }
}
