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
public class ex15 {
      public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    
    int dias;
    
    System.out.println("Digite quantos dias voce trabalhou este mes");
    dias = teclado.nextInt();
    double salario = dias * 200;
    System.out.println("Voce rebeu " + salario + "R$ este mes, referente as seus " + dias + "dias de trabalho");
    
      
      
      
      }
    
}
