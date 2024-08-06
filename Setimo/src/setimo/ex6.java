/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setimo;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex6 {
    public static void main(String[] args) {
        HashSet<String>animais = new HashSet<>(Arrays.asList("Piolho", "avestruz","Leao","cachorro", "Onca"));
        
        boolean presente = animais.contains("cachorro");
        System.out.println("Esta lista contem um cachorro: " + presente);
    }
    
}
