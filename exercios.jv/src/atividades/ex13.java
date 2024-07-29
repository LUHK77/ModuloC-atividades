/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex13 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    double salarioAtual;
    
    System.out.println("Digite seu salario de clt");
    salarioAtual = teclado.nextDouble();
    double aumento = (salarioAtual /100) * 15;
    double salarioAumentado = salarioAtual + aumento;
    System.out.println("Seu salario aumentou: " + salarioAumentado);
    }
    
}
