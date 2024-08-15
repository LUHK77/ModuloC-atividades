/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class ex8 {

    public static void exibeMatrix(int[][] array, int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf(array[i][j] + "  ");
            }

            System.out.println("");
        }
    }

    public static void criaMatrix(int[][] array, int a, int b) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int[][] matrix2 = new int[2][2];
        criaMatrix(matrix, 2, 2);
        exibeMatrix(matrix, 2, 2);
        System.out.println("--------------------------------------");
        criaMatrix(matrix2, 2, 2);
        exibeMatrix(matrix2, 2, 2);
        int a, b, c;
        System.out.println("--------------------------------------");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                
                if (i == 1) {
                    if (i == 1 && j == 1) {
                    a = matrix[i][j-1] * matrix2[i - 1][j];
                    b = matrix[i][j] * matrix2[i][j];
                    c = a + b;
                    System.out.printf(c + " ");
                    break;
                }
                    a = matrix[i][j] * matrix2[i - 1][j];
                    b = matrix[i][j + 1] * matrix2[i][j];
                    c = a + b;
                    System.out.printf(c + " ");

                } else{
                
                if (j > 0) {
                    a = matrix[i][j - 1] * matrix2[i][j];
                    b = matrix[i][j] * matrix2[i + 1][j];
                } else {
                    a = matrix[i][j] * matrix2[i][j];
                    b = matrix[i][j + 1] * matrix2[i + 1][j];
                }
                c = a + b;
                System.out.printf(c + " ");
               }
            }
            System.out.println("");
        }
    }

}
