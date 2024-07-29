/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex13 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    Random nmrAleatorio = new Random();
    int nmr;
    int n5 = 0;
    int n3 = 0;
    
    for(int i = 0; i < 20; i++){
    
        
        nmr = nmrAleatorio.nextInt(10);
        System.out.println(nmr);
        
        if(nmr > 5){
        n5+= 1;
        }
        if(nmr%3 == 0){
        n3++;
        }
        
        
    }
        System.out.println("Sao " + n5 +" numeros maiores que 5, e " + n3 + " numeros divisiveis por 3");
    
}
}