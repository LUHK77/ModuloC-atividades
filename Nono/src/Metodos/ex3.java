/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex3 {
    
    public static int fatora(int a) {
       int fatorial = a;
     
       for(int i = a-1; i > 0;i--){
       fatorial *= i;
       }
       return fatorial;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Digite seu numero que quer fatora");
        num = teclado.nextInt();
        
        int resultado = fatora(num);
        System.out.println(resultado);
    }
}
