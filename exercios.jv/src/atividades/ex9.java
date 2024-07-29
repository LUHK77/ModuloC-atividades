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
public class ex9 {
    
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    
    double salario;
    
    System.out.println("Digite seu montante atual");
    salario = teclado.nextDouble();
    double salarioDolar = salario / 5.45;
    System.out.println("Seu seu montante atual eh: " + salario + "R$ e em dolar seria " + salarioDolar + "US$");
    }
    
}
