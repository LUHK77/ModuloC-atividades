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
public class departamentoTragos {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int AnoAtual, AnoNacimento, idade;  
    
    System.out.println("Qual ano voce esta digitando isso, sem mentir :)");
    AnoAtual = teclado.nextInt();
    System.out.println("Qual ano voce nasceu, sem mentir em");
    AnoNacimento = teclado.nextInt();
    
    idade = AnoAtual - AnoNacimento;
    
    if(idade < 18){
       System.out.println("Vai beber teu toddy");
    } else {
       System.out.println("Ta liberado, vai la pro bar");
       
    }
    
    
    }
    
}
