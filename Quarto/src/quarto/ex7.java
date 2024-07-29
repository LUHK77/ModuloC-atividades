/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex7 {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
     int numeroIncremento, numeroInicial, numeroFinal;
         System.out.println("Digite o valor para começar a contagem");
         numeroInicial = teclado.nextInt();
         System.out.println("Digite o valor para finalizar a contagem");
         numeroFinal = teclado.nextInt();
         System.out.println("Digite o valor para ser o incremento");
         numeroIncremento = teclado.nextInt();
         
         for(int i = numeroInicial; i < numeroFinal;i += numeroIncremento ){
             System.out.println(i);
             
             if(i+numeroIncremento > numeroFinal){System.out.println("Acabou");}
         }
         
     }
    
}
