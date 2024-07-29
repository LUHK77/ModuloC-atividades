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
public class ex8 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    
    double distanciaMetros;
    System.out.println("Digite a distancia a metros");
    distanciaMetros = teclado.nextDouble();
    double distanciaCentimetros = distanciaMetros * 100;
    double distanciaKm = distanciaMetros / 1000 ;
    System.out.println("A distancia em Kilometros seria: " + distanciaKm + 
            "Km e a distancia em centimetros seria: " + distanciaCentimetros + "cm");
    
    
    }
    
}
