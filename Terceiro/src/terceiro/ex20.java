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
public class ex20 {
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    int nmr;
    System.out.println("Digite um numero");
    nmr = teclado.nextInt();
    int nmrQ = nmr%2;
    
    
    if(nmrQ == 0){
     System.out.println("Seu numero eh par");
    } else {System.out.println("Seu numero eh imper");}
} 
    
}
