/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor;
    
    System.out.println("Digite um valor para fazer uma contagem de 0 ate este valor");
    valor = teclado.nextInt();
    for(int i = 0; i <= valor; i++){
        System.out.println(i);
    }
    
    
    }
    
}
