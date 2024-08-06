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
public class ex7 {
    public static void main(String[] args) {
        HashSet<String>cores =  new HashSet<>(Arrays.asList("azul","roxo","vermelho"));
        
        boolean vermelho = cores.contains("vermelho");
        System.out.println("Tem a cor vermlho na lista: " + vermelho);
    }
    
}
