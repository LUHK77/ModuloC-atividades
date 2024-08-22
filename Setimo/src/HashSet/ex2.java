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
public class ex2 {
    public static void main(String[] args) {
        HashSet<String>frutas = new HashSet<>(Arrays.asList("Banana", "Pera", "Morango", "Melancia", "Maca"));
        
        frutas.remove("Pera");
        
        System.out.println(frutas);
        
    }
    
}
