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
public class ex5 {
    
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    double nota1;
    double nota2;
    
    System.out.println("Digite sua primeira nota");
    nota1 = teclado.nextDouble();
    System.out.println("Digite sua segunda nota");
    nota2 = teclado.nextDouble();
    
    double mediaNotas = (nota1 + nota2)/2;
    System.out.println("A media e: " + mediaNotas);
    
    }
    
}
