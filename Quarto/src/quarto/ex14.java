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
public class ex14 {
         public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double maior = 0;
    double menor = maior;
    double preco;
    
    
    for(int i = 0; i < 8; i++){
        
        System.out.println("Digite um numero");
        preco = teclado.nextDouble();
        if(preco > maior){
          maior = preco;  
        }
        if(preco < menor){
        menor = preco;
        }
         if(menor == 0){
        menor = preco;
 }
       
    
    
    }
             System.out.println("O maior eh " + maior + " e o menor eh " + menor);
    }
         
    
}
