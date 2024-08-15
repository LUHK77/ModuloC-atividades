/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex7 {

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
                array[i][j] = count;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        criaMatrix(matrix, 4, 4);
        exibeMatrix(matrix, 4, 4);
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > maiorNumero) {
                    maiorNumero = matrix[i][j];
                }
                if (menorNumero > matrix[i][j] || menorNumero == 0) {
                    menorNumero = matrix[i][j];
                }

            }
        }
        System.out.println("O maior numero eh " + maiorNumero + " e o menor numero eh " + menorNumero);
    }

}
