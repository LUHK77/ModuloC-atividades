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
public class ex5 {

    public static int contaVogais(String palavra) {
        int count = 0;
        for (int i = 0; i < palavra.length(); i++) {
          char letra = palavra.charAt(i);
            switch(letra){
              case 'a','e','i','o','u':
               count++;
              }

            }
           return count;
        }
     public static void main(String[] args) {
        String pa;
        Scanner teclado = new Scanner(System.in);
         System.out.println("Digite uma palavra");
         pa = teclado.nextLine();
        int result = contaVogais(pa);
        
        System.out.println("A sua palavra tem " + result + " vogais");
        
    }

}
   
   
