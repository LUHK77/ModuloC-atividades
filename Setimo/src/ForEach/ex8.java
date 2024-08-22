/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 21, 23, 11, 4, 8, 9, 6));

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.printf(0 + " ");

            } else {
                System.out.printf(numero + " ");
            }

        }
    }

}
