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
public class ex21 {
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    int ano;
    
    System.out.println("Digite seu ano");
    ano = teclado.nextInt();
    int anoBixesto = ano%4;
    
    if(anoBixesto == 0){
     System.out.println("Eh bissexto");
    } else {
      System.out.println("Nao");
    }
    
    
    
    }
    
}
