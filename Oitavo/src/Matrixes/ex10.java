/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex10 {

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
        int[][] matrix = new int[4][4];
        criaMatrix(matrix,4,4);
        exibeMatrix(matrix,4,4);
        System.out.println("-------------------------");
        int soma = 0;
        double media; 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matrix[i][j];
            }
        }
        media =soma / (matrix.length * matrix.length);
        System.out.printf("A media %.2f\n",media);
    }

}
