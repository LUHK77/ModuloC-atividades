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
public class ex8 {
    public static void main(String[] args) {
        HashSet<String>cidades = new HashSet<>(Arrays.asList("Tramandai", "Capao", "imbe", "Osorio", "Marica", "Sao Paulo"));
        
        cidades.remove("Sao Paulo");
        
        System.out.println(cidades);
    }
    
}
