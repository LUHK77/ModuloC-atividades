/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex4 {
    
    public static int converteCelcius(int c) {
      int  F = (c * 9/5) + 32;
      return F;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c;
        System.out.println("Digite os graus em Celcius para converte para Fahrenheit");
        c = teclado.nextInt();
        
        int f = converteCelcius(c);
        System.out.println(f);
        
    }
}
