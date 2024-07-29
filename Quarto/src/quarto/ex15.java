/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex15 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int idades[] = new int[10];
        int soma = 0;
        int maiorQue18 = 0;
        int menos5 = 0;
        int idadeMaior = 0;
        
        for(int i = 0;i < idades.length;i++){
            System.out.println("Digite sua idade");
            idades[i] = teclado.nextInt();
            
            soma += idades[i];
            if(idades[i] >= 18){
                maiorQue18 ++;
            }
            if(idades[i] <= 5){
                menos5 ++;
            }
            if(idades[i] > idadeMaior){
                idadeMaior = idades[i];
            }
        }
        
        int media = soma / idades.length;
        System.out.println("A media das idades eh " + media + " anos");
        System.out.println("A " + maiorQue18 + " pessoas com mais de 18 anos");
        System.out.println("A " + menos5 + " pessoas com 5 anos ou menos");
        System.out.println("A maior idade do grupo eh " + idadeMaior + " anos");
       
    
    }
    
}
