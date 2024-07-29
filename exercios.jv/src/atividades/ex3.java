package atividades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TI
 */
public class ex3 {
     public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    String nome;
    double salario;
    
    System.out.print("Digite seu nome");
    nome = teclado.nextLine();
    System.out.print("Digite seu salario");
    salario = teclado.nextDouble();
    System.out.println("Nome do funcionario: " + nome);
    
    System.out.println("Salario: " + salario + "R$");
      }
    
}
