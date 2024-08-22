/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex9 {
    public static void main(String[] args) {
        HashSet<Character>alfabeto = new HashSet<>(Arrays.asList('a','b','c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        
        System.out.println("O tamanho do alafabeto e de: " + alfabeto.size() + " letras");
    }
    
}
