/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex5 {
    public static void main(String[] args) {
        HashSet<String>nomes = new HashSet<>(Arrays.asList("jorge","dorivaldo","martildo","geturdes","krontrsyu","cvghuciolostupisto da silva"));
        
        nomes.forEach(System.out::println);
    }
    
}
