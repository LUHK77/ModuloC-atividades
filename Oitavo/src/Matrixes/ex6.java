/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex6 {
     public static void exibeMatrix(int[][] array,int a,int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf(array[i][j] + "  ");
            }

            System.out.println("");
        }
    }

    public static void criaMatrix(int[][] array,int a,int b) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = count;
                count++;
            }
        }
    }
    
    public static void main(String[] args) {
        int [][] matrix = new int [4][4];
        criaMatrix(matrix,4,4);
        exibeMatrix(matrix,4,4);
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < 4; i++) {
            int somaI = 0;
            int somaJ = 0;
            for (int j = 0; j < 4; j++){
            somaI += matrix[i][j];
            somaJ += matrix[j][i];
            }
            System.out.println("Coluna " + (i + 1) + " tem o valor " + somaJ);
             System.out.println("Linha " + (i + 1) + " tem o valor " + somaI);
             System.out.println("---------------------------------------------");
        }
    }
    
}
