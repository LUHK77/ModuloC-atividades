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
public class ex25 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    double ladoA, ladoB, ladoC;
    
        System.out.println("Digite o comprimento do primeiro lado");
        ladoA = teclado.nextDouble();
        System.out.println("Digite o comprimento do segundo lado");
        ladoB = teclado.nextDouble();
        System.out.println("Digite o comprimento do terceiro lado");
        ladoC = teclado.nextDouble();
        
        if(ladoA <= ladoB+ladoC && ladoB <= ladoA+ladoC && ladoC <= ladoB+ladoA){
            System.out.println("Os comprimentos estao certos, realmente eh um triangulo");
        } else {
            System.out.println("Os comprimentos tem valores invalidos para ser um trinagulo, isso nao eh um triangulo");
        }
    }
    
}
