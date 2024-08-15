/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex4 {
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
         criaMatrix(matrix);
          int diagonal[] = {matrix[0][0],matrix[1][1],matrix[2][2]};
          int diagonal2[] = {matrix[0][2],matrix[1][1],matrix[2][1]};
          int soma1 = diagonal[0] + diagonal[1] + diagonal[2];
          int soma2 = diagonal2[0] + diagonal2[1] + diagonal2[2];
          
          exibeMatrix(matrix);
          System.out.println("--------------------------------------");
          System.out.println("A soma da primeira diagonal eh " + soma1);
          System.out.println("A soma da segunda diagonal eh " +  soma2);
    }
    
}
