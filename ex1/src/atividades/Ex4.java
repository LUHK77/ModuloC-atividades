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
public class Ex4 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int n1;
    int n2;
    
    System.out.println("Digite o primeiro numero");
    n1 = teclado.nextInt();
    System.out.println("Digite segundo numero");
    n2 = teclado.nextInt();
    
    int soma = n1 + n2;
    
    System.out.println("O resultado eh: " + soma);
    
    }
    
}
