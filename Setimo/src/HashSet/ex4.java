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
public class ex4 {
    public static void main(String[] args) {
        HashSet<String>cidades = new HashSet<>(Arrays.asList("Tramandai", "Capao", "imbe", "Osorio", "Marica"));
        
        
        
        boolean vazio=cidades.isEmpty();
        
        System.out.println("A lista de cidade esta vazia: " + vazio);
    }
    
}
