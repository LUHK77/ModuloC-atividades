/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quinto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex60 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        String genero, pergunta;
        int idade; 
        int maiorIdade = 0;
        String nomeVelho = "", nomeMulher = "", nome;
        int mulherJovem = 0;
        int homemCadastrado = 0;
        int homem30 = 0;
        int mulheres18 = 0;
        int somaIdades= 0;
        int pessoas = 0;
        int mediaIdades = 0;
        
        do{
            System.out.println("Qual seu nome?");
            nome = teclado.nextLine();
            System.out.println("Qual seu genero? [H/F] :");
            genero = teclado.nextLine();
            System.out.println("Qual sua idade?");
            idade = teclado1.nextInt();
            
            somaIdades += idade;
            pessoas++;
            if(maiorIdade < idade || maiorIdade == 0){
            maiorIdade = idade;
            nomeVelho = nome;
            }
            
            switch(genero){
                case "H":
                    homemCadastrado++;
                    if(idade > 30){
                    homem30++;
                    }
                    break;
                case "F":
                    if(idade < 18){
                    mulheres18++;
                    }
                    if(mulherJovem > idade || mulherJovem == 0){
                    mulherJovem = idade;
                    nomeMulher = nome;
                    }

                    
                    break;   
                default:
                    System.out.println("Invalido");
                    break;
                        
               }
            mediaIdades = somaIdades / pessoas;
            System.out.println("Quer parar? [S/N]: ");
                    pergunta = teclado.nextLine();
                   
        } while(!pergunta.equalsIgnoreCase("S"));
        System.out.println("A pessoa mais velha do grupo é " + nomeVelho + " a mulher mais jovem é a " + nomeMulher + "\n");
        System.out.println("A media das idades é " + mediaIdades + " anos , a quantidade de homens com mais de 30 anos é " + homem30 + "\n");
        System.out.println("A quantidade de mulheres com menos de 18 é " + mulheres18 + "\n");
    
}
}
