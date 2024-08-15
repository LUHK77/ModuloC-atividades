/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex9 {
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
        int [][]matrix = new int[3][3];
        int [][]matrix2 = new int[3][3];
        criaMatrix(matrix,3,3);
        criaMatrix(matrix2,3,3);
        exibeMatrix(matrix,3,3);
        System.out.println("-------------------------------------");
        exibeMatrix(matrix2,3,3);
        System.out.println("-------------------------------------");
        int resultado;
        for(int i = 0;i < 3;i++){
        for(int j = 0; j < 3;j++){
         resultado = matrix[i][j] - matrix2[i][j];
            System.out.printf(resultado + " ");
        }
            System.out.println("");
        }
    }
    
}
