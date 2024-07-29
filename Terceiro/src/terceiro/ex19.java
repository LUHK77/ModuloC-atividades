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
public class ex19 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    String nome;
    double nota1, nota2, media;
    System.out.println("Qual o nome do aluno");
    nome = teclado.nextLine();
     System.out.println("Qual foi sua primeira nota");
    nota1 = teclado.nextDouble();
    System.out.println("Qual foi sua segunda nota");
    nota2 = teclado.nextDouble();
    media = (nota1 + nota2)/2;
    System.out.printf( nome + " sua media foi de: %.2f\n", media);
    
    if(media < 7){
    System.out.println("Voce esta abaxo da meida, esta com um mal desempenho");
    } else {
    System.out.println("Voce esta com um bom desempenho, continue assim");
    }
    
    }
    
}
