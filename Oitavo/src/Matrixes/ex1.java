/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex1 {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int soma = 0;
        
        for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
         matrix[i][j] = i;
        }
       }
        
         for(int i = 0; i < 3; i++){
             
         for(int j = 0; j < 3; j++){
             System.out.printf(matrix[i][j]+" ");
             soma += matrix[i][j];
        }
             System.out.println(" ");
       }
         System.out.println(soma);
        
    }
}
