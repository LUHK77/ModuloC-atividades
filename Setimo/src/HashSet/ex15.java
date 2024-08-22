/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex15 {

    public static void main(String[] args) {
        HashSet<Integer> lista = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6, 7));

        int lista1[] = new int[6];

        int i = 0;

        for (int num : lista) {
            lista1[i] += num;
            i++;
            System.out.println(num);
        }
        
        
       
        for(int num : lista1){
        
            System.out.println(num);
        }
    }
}
