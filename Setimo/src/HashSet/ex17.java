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
public class ex17 {
    public static void main(String[] args) {
        HashSet<String>carros = new HashSet<>(Arrays.asList("fusca", "palio", "tesla"));
        HashSet<String>carros2 = new HashSet<>(Arrays.asList("toyta", "bmw", "jeep"));
        
        carros.addAll(carros2);
        System.out.println(carros);
        
        
        
    }
    
}
