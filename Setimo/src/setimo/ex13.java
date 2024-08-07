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
public class ex13 {
    public static void main(String[] args) {
     
        HashSet<Integer>numeros = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        HashSet<Integer>numeros2 = new HashSet<>(Arrays.asList(5,6,7,8,9,10,11,12,13,14,15));
        
        for(int num1 : numeros){
         for(int num2 : numeros2){
           if(num1 == num2){
               System.out.println(num1);
           }
         }
        }
        
    }
    
}
