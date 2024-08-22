/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ex10 {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 21, 23, 11, 4, 8, 9, 6));
       int numeroPar = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numeroPar++;

            }
            
        }
        System.out.println(numeros);
        System.out.println("A quantia de numeros pares eh " + numeroPar);
    }
    
}
