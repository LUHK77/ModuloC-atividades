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
public class ex12 {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int par = 0;
         int impar = 0;
     for(int i = 0; i < 6; i++){
        int nmr;
    
        System.out.println("Digite um numero");
        nmr = teclado.nextInt();
        
        if(nmr%2 == 1){
        impar +=1;
        } else if (nmr%2 == 0) {
             par +=1;
         }
}
         System.out.println("Voce digitou "+ par + " numeros pares, e " + impar + " numeros impares");
       
     }
   }
    

