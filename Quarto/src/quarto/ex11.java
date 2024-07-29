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
public class ex11 {
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int soma = 0;
    for(int i = 0; i < 7; i++){
        int nmr;
    
        System.out.println("Digite um numero");
        nmr = teclado.nextInt();
        soma += nmr;
                }
         System.out.println(soma);
}
    
}
