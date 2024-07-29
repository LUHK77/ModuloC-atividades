/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex13 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int op;
        int num[] = new int[];
        
    String menu[] = {"1-Calcular Soma","2-Exibir Media", "3-Sair"};
    
    
    do{
        System.out.println("Digite o valor do menu que voce quer");
    for(int i = 0; i < menu.length;i++){
        System.out.printf(menu[i] + " ");
    }
    op = teclado.nextInt();
    
    switch(op) {
        case 1:
            System.out.println("Escreva os valores que voce quer somar\n");
            System.out.println("Primeiro numero");
            num =  teclado.nextInt();
            System.out.println("Segundo numero");
            num =  teclado.nextInt();
    
    }
    } while 
    
   
    }
    
}
