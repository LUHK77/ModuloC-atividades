/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;


/**
 *
 * @author Aluno
 */
public class ex10 {
    
public static int maiorNumero (int[] array){

int maiorNumero = 0;
 for (int i = 0; i < array.length;i++){
     if(array[i] > maiorNumero)
    maiorNumero = array[i];
    }
   
   return maiorNumero;
}

  public static void criaArray(int[] array,int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
                array[i] = count;
                count++;
            }
        }
    public static void main(String[] args) {
        
    
    int []numeros = new int[10];
    criaArray(numeros,10);
    int resutado = maiorNumero(numeros);
    
        System.out.println("O maior numero eh: " + resutado);
    
   }
    
    
}
