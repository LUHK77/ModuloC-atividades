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
public class ex57 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        String genero, pergunta;
        double salario;
        double salarioH = 0; 
        double salarioM = 0;
        
        do{
            System.out.println("Qual seu genero? [H/F] :");
            genero = teclado.nextLine();
            System.out.println("Qual seu salario?");
            salario = teclado1.nextDouble();
            
            switch(genero){
                case "H":
                    salarioH += salario;
                    break;
                case "F":
                    salarioM += salario;
                    break;   
                default:
                    System.out.println("Invalido");
                    break;
                        
               }
            
            System.out.println("Quer parar? [S/N]: ");
                    pergunta = teclado.nextLine();
        } while(!pergunta.equalsIgnoreCase("S"));
    System.out.println("O salario total dos homens eh " + salarioH + "R$ e o salario das mulheres eh " + salarioM + "R$");
    
        
    
    
    }
    
}
