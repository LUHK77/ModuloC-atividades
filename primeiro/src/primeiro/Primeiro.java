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
public class Primeiro {

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
    String nome;
    double nota1;
    double nota2;
    long aa = 11;
    
    System.out.println("digite o nome do aluno");
     nome = teclado.nextLine();
    System.out.println("digite sua nota do primeiro semestre, sem mentir :) ");
     nota1 = teclado.nextInt();
    System.out.println("digite sua nota do segundo semestre, sem  denovo mentir :) ");
     nota2 = teclado.nextInt();
     double calculaMediaNotas = (nota1 + nota2)/2;
    System.out.println("Ola" + nome + " a meida das suas notas eh " + calculaMediaNotas);
    if(calculaMediaNotas < 6){
    System.out.println("Sua nota foi incrivelmente baixa");
    
    } else {
        System.out.println("Parabens seu pobre");
    }
    
    }
}
