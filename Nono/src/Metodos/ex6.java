/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex6 {
    
    public static boolean verificaPolindromo(String palavra) {
    ArrayList<Character>letras = new ArrayList<>();    
    boolean polindromo = false;
        for (int i = 0; i < palavra.length(); i++) {
          letras.add(palavra.charAt(i)); 
        
    }
        if(letras.equals(letras.reversed())){
        
            polindromo = true;
            
        }
    return polindromo;
}
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Digite sua palavra para a verificacao");
        palavra = teclado.nextLine();
        
        boolean polindromo = verificaPolindromo(palavra);
        System.out.println("Sua palavra eh polindromo: " + polindromo);
    }
    
}