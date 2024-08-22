/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ex8 {
public static int calculaMedia (int[] array){

int soma = 0;
 for (int i = 0; i < array.length;i++){
    soma += array[i];
    }
   int media = soma/array.length;
   return media;
}

  public static void criaArray(int[] array,int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
                array[i] = count;
                count++;
            }
        }
    


    public static void main(String[] args) {
        
    
    int []numeros = new int[8];
    criaArray(numeros,8);
    int media = calculaMedia(numeros);
    
        System.out.println("A media aritimetica eh " + media );
    
   }
}
