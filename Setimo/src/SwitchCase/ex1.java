/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        
        System.out.println("Digite que dia eh hoje de 1 a 7");
        escolha = teclado.nextInt();
        
        switch(escolha){
        
            case 1:
                System.out.println("Domingo!");
                break;
                
            case 2:
                System.out.println("Segunda :( ");
                break;
            case 3:
                System.out.println("Terça, capitulo novo de chainsaw man");
                break;            
            case 4:
                System.out.println("Quarta, bem paia na real");
                break;
            case 5:
                System.out.println("Quinta, bem hype");
                break;
            case 6:{
                System.out.println("Sextou paizão, vai pro CAPS");
                break;
            }
            case 7:{
                System.out.println("Sabado! RECEBA!!!!!!");
                break;
            }
        }
        
    }
    
}
