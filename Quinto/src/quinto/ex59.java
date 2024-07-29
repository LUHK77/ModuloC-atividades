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
public class ex59 {
 public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        String genero, pergunta;
        int idade; int maiorIdade = 0;
        int mulherJovem = 0;
        int homemCadastrado = 0;
        int somaIdades=0;
        int pessoas = 0;
        int mediaIdades = 0;
        
        do{
            System.out.println("Qual seu genero? [H/F] :");
            genero = teclado.nextLine();
            System.out.println("Qual sua idade?");
            idade = teclado1.nextInt();
            
            if(maiorIdade < idade || maiorIdade == 0){
            maiorIdade = idade;
            }
            
            switch(genero){
                case "H":
                    somaIdades += idade;
                    homemCadastrado++;
                    pessoas++;
                    break;
                case "F":
                    somaIdades += idade;
                    pessoas++;
                    if(mulherJovem > idade || mulherJovem == 0){
                    mulherJovem = idade;
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
    System.out.println("A maior idade do grupo eh " + mediaIdades + " anos, a quantidades de homens cadastrados foi " + homemCadastrado);
     System.out.println("A idade da mulher mais jovem, eh " + mulherJovem + " anos, e a maior idade é " + maiorIdade + " anos");
    
        
    
    
    }
    
}