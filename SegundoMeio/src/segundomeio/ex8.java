/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
public class ex8 {
    public static void main(String [] args){
    int numeros1[] = {2, 3, 4, 5, 7};
    int numeros2[] = {5, 8, 9, 6, 4};
    int numeros3[] = new int [10];
    
    /*for(int i = 0; i < numeros1.length;i++){
    numeros1[i] = (int) (Math.random() * 100) + 1;
    numeros2[i] = (int) (Math.random() * 100) + 1;
            } */
    
    for(int i = 0; i < numeros3.length; i++){
        if(i >= 5){
     numeros3[i] = numeros2[i - 5];
     }  else {
     numeros3[i] = numeros1[i];
        }
     
        System.out.println(numeros3[i]);
    }
  }   
} 
  
