/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex5 {

    public static void exibeMatrix(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(array[i][j] + " ");
            }

            System.out.println("");
        }
    }

    public static void criaMatrix(int[][] array) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = count;
                count++;
            }
        }
    }
    public static void main(String[] args) {
       int[][] matrix = new int[3][3];
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
       int valor = teclado.nextInt();
       criaMatrix(matrix);
       exibeMatrix(matrix);
        System.out.println("----------------------------");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
          int resposta = matrix[i][j] * valor;
                System.out.printf(resposta + " ");
            
            }
            System.out.println("");
       }
       
    }

}
