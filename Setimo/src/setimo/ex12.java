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
public class ex12 {
    
    public static void main(String[] args) {
        HashSet<Integer>numeros = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        for (int i = 2; i <= 10; i+=2){
        numeros.remove(i);
        }
        
        System.out.println(numeros);
    }
    
}
