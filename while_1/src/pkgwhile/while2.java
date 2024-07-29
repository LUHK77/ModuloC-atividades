/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author TI
 */
    public class while2 {
        public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do{
          System.out.print("Menu Principal:\n");
            System.out.println("1. Opcao 1");
            System.out.println("2. Opcao 2");
            System.out.println("3. Sair");
            System.out.println("Digite sua opcao: ");

            opcao = teclado.nextInt();
            switch (opcao){
                case 1: 
                    System.out.println("Voce escolher a opcao 1!");
                    break;
                case 2: 
                    System.out.println("Voce escolher a opcao 2!");
                    break;
                case 3:
                    System.out.println("Sainda do menu...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while(opcao != 3);
        
        }

    }
