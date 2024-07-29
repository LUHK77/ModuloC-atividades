package atividades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TI
 */
public class ex7 {
    
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    int nmr;
    
    System.out.println("Digite um numero");
    nmr = teclado.nextInt();
    double nmrDobro = nmr * 2;
    double nmrTerceiraParte = nmr /3;
    System.out.println("Seu numero eh: " + nmr + " o dobro eh: " + nmrDobro + " e a terceira parte eh: " + nmrTerceiraParte);
    }
    
}
