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
public class ex16 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    int cigarrosDia;
    int cigarrosAno;
    
    System.out.println("Quantos cigarros voce fuma por dia");
    cigarrosDia = teclado.nextInt();
    System.out.println("A quantos anos voce fuma cigarro");
    cigarrosAno = teclado.nextInt();
    int tempoPerdido = (((cigarrosDia *10) * 365)* cigarrosAno);
    int tempoPerdidoHoras = tempoPerdido / 60;
    System.out.println("Voce perdeu " + tempoPerdidoHoras + " Horas da sua vida fumando, "
            + "sem falar as doencas e sua espectativa de vida diminuindo");
    
    
    
    }
    
}
