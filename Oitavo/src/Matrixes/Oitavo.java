/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrixes;

/**
 *
 * @author Aluno
 */
public class Oitavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int tabuada[][] = new int[10][10];
        
        for (int i = 0; i < 10; i++){
         for (int j = 0; j <10; j++){
           tabuada[i][j] = (i + 1) * (j + 1);
         }
        }
        
       for (int i = 0; i < 10; i++){
         for (int j = 0; j <10; j++){
             System.out.println("Tabuada : " + (i + 1)+ " x " + (j + 1) + " : " + tabuada[i][j]);
         }
           System.out.println("*******************************************************");
    }
        System.out.println(" ");
  }
    
}


    

