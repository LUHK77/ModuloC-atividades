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
public class ex18 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    int anoAtual = 2024;
    int anoNascimento, idade;
    
    System.out.println("Que ano voce nasceu?");
    anoNascimento = teclado.nextInt();
    idade = anoAtual - anoNascimento;
    if(idade < 16){
     System.out.println("Voce nao tem idade para votar");
    } else {
     System.out.println("Voce pode votar, va a urna");    
    }
    
    }
    
}
