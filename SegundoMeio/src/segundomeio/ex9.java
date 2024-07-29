/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
    public class ex9 {
        public static void main(String []args){
        int numeros[] = new int [10];
        int pares = 0;
        int impares = 0;

          for(int i = 0; i < numeros.length;i++){
        numeros[i] = (int) (Math.random() * 100) + 1;
        
        if(numeros[i]%2 == 0){
        pares ++;
        } else {
        impares++;
        
        }
              System.out.printf(numeros[i] + " ");
        
                }
            System.out.println("\nSao " + pares + " numeros pares");
            System.out.println("Sao " + impares + " numeros impares");
          
          
        }

    }
