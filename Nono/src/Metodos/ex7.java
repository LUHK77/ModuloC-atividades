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
public class ex7 {

    public static void ordenaArray(int[] array) {
        int t;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j]> array[j+1]){
                t = array[j];
                array[j] = array[j+1];
                array[j+1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int lista[] = {1, 3, 43, 11, 7, 2};

      

        for (int i = 0; i < lista.length; i++) {
            System.out.printf(lista[i] + " ");
        }

        System.out.println(" ");

       ordenaArray(lista);
       
      for (int i = 0; i < lista.length; i++) {
            System.out.printf(lista[i] + " ");
        }
    }

}
