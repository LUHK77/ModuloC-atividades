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
public class ClasseAula {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    double nota1, nota2, media;
    
    System.out.println("Qual sua primeira nota");
    nota1 = teclado.nextDouble();
    System.out.println("Qual sua sugunda nota");
    nota2 = teclado.nextDouble();
    
    media = (nota1 +nota2)/2;
    System.out.printf("Sua media foi: %.2f\n", media );
    
     if(media < 7) {
     System.out.println("Voce foi REPROVADO");
     } else {
     System.out.println("Voce foi APROVADO");
     }
    }
    
}
