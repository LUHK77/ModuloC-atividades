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
public class ex11 {
    public static void main(String[] args) {
        HashSet<Integer>numeros = new HashSet<>();
        
        int valor2 = (int) (Math.random() * 100) + 1;
        for(int i = 0; i< valor2; i++){
            int valor = (int) (Math.random() * 100) + 1;
        numeros.add(valor);
        }
        
        System.out.println("O tamanho da lista eh de: " + numeros.size());
        
        
        
    }
    
}
