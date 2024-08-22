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
public class ex9 {
    
    public static int calculaPotencia(int n,int p){
        int resultado = 1;
    for (int i = 0; i < p;i++){
    resultado *=n;
        System.out.println(resultado);
     
    }
    return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num,potencia;
        
        System.out.println("Digite um numero");
        num = teclado.nextInt();
        System.out.println("Digite o valor que quer potencializar");
        potencia = teclado.nextInt();
        
        int result = calculaPotencia(num,potencia);
        System.out.println("O resultado eh: " + result);
    }
    
}
