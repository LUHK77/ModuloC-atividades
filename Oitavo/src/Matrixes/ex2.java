/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class ex2 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int count = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
            if(count%2 == 0){
                matrix[i][j] = 1;
                
            } else {
                matrix[i][j] = 0;
            }
            count++;
            
                System.out.printf(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
        int diagonal[] = {matrix[0][0],matrix[1][1],matrix[2][2]};
        int soma = 0;
        for (int i : diagonal){
        soma += i;
        }
        
        
        if(soma == 3 || soma == 0){
                System.out.println("sua diagonal tem valores iguais");
            }

    }
}