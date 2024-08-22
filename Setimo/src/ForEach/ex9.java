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
public class ex9 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 21, 23, 11, 4, 8, 9, 6));
        int numeroMenor = 0;

        for (int numero : numeros) {
         
            if(numero < numeroMenor || numeroMenor == 0){
            numeroMenor = numero;
            }
            
        }
        System.out.println(numeroMenor);
    }

}
