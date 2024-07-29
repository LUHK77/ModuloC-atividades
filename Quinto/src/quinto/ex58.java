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
public class ex58 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    int idade;
    int somaIdades = 0;
    int alunos = 0;
    double mediaIdades;
    
    do{
        System.out.println("Digite a idade do aluno");
        idade = teclado.nextInt();
        
        switch(idade){
            
            case 999: 
                break;
            default:
                alunos++;
                somaIdades += idade;
        }
        mediaIdades = somaIdades/alunos;
    }while(idade != 999);
    System.out.println("A quantidade de alunos é " + alunos + " e a media das suas idades é " + mediaIdades + " anos.");
    
}
}
