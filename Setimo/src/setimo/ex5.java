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
public class ex5 {
    public static void main(String[] args) {
        HashSet<String>cores = new HashSet<>(Arrays.asList("azul", "roxo","vermelho","verde", "preto"));
        
        cores.forEach(System.out::println);
    }
    
}
