/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex22 {
  
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    int anoAtual = 2024;
    int anoNascimento, idade;
    
    System.out.println("Qual ano voce nasceu?");
    anoNascimento = teclado.nextInt();
    idade = anoAtual - anoNascimento;
    if(idade < 18) {
    int idadeFalta = 18 - idade; 
    System.out.println("Voce ainda nao pode se alistar, faltam " + idadeFalta + " anos, para voce se alistar");
    
    } else if(idade == 18) {
    System.out.println("Voce deve se alistar esse ano");
    } else {
    System.out.println("Voce ja se alistou, ou ja deveria ter se alistado, se nao se laistou");
    }
   
    
    
    }
}
