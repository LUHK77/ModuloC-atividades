/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*   Scanner teclado = new Scanner(System.in);
       String nome;
       String idade;
       System.out.println("digite seu nome");
       nome = teclado.nextLine();
       System.out.println("digite seu idade");
       idade = teclado.nextLine(); 
       System.out.println("O nome digitado eh: " + nome + "e sua idade eh " + idade); */
    //Crie um algoritimo que pergunte o nome do aluno, 
    //pergunte a Nota1 e a Nota2, calcule a media e mostre o nome do aluno´por sua media
    Scanner teclado = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    System.out.println("Digite o valor de a");
     a = teclado.nextInt();
     System.out.println("Digite o valor de b");
     b = teclado.nextInt();
     System.out.println("Digite o valor de c");
     c = teclado.nextInt();
    double delta = b*b-4*a*c;
    double resultadoX1 = (-b+(Math.sqrt(delta)))/2*a;
    double resultadoX2 = (-b-(Math.sqrt(delta)))/2*a;
    
    System.out.println("Os resultados dos valores sao x1: " + resultadoX1 + "e x2: " + resultadoX2);
    
    
    }
}