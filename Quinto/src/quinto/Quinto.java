/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Quinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n; 
        int soma = 0;
        int r;
        
        do{
            System.out.println("Digite os valores");
            n = teclado.nextInt();
            soma += n;
            System.out.println(soma);
            System.out.println("Quer continuar? [1-Sim ou 1111-Nao]: ");
            r = teclado.nextInt();
            
        
        } while (r != 1111);
        
    }
}

