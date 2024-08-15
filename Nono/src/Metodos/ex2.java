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
public class ex2 {
    public static boolean parOuImpar(int a){
    boolean par = a%2 == 0;
    return par;
    }
    
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor ");
        valor = teclado.nextInt();
        
        boolean par = parOuImpar(valor);
        
        System.out.println("Seu numero eh par: " + par);
        
    }
}
