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
public class ex11 {
    public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    System.out.println("Digite o valor de a");
     a = teclado.nextDouble();
     System.out.println("Digite o valor de b");
     b = teclado.nextDouble();
     System.out.println("Digite o valor de c");
     c = teclado.nextDouble();
    double delta = Math.pow(b,2)-4*a*c;
    if(delta <= -1){
     System.out.println("Nao pode fazer raiz quadrada de numero negativo");
    } else {
    double deltaRaiz = Math.sqrt(delta);
    
    double resultadoX1 = (-b+ (deltaRaiz))/(2*a);
    double resultadoX2 = (-b- (deltaRaiz))/(2*a);
    
    System.out.println("Os resultados dos valores sao x1: " + resultadoX1 + " e x2: " + resultadoX2);
    }
   
    
    
    }
}