/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex6 {
    
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);    
    int nmr;
    System.out.println("Digite o valor");
    nmr = teclado.nextInt();
    int nmrAntes = nmr -1;
    int nmrDepois = nmr +1;
    System.out.println("O seu numero eh: " + nmr + " antecesor dele eh: " + nmrAntes + " e o sucessor eh: " + nmrDepois);
    }
    
}
