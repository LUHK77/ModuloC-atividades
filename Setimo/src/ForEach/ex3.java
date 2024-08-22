/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

/**
 *
 * @author Aluno
 */
public class ex3 {
    public static void main(String[] args) {
        int numeros[] = {4,6,7,8,2};
        int maiorNum = 0;
        
        for (int numero1 : numeros){
        for (int numero : numeros){
        if(numero1 < numero){
        maiorNum = numero;
        }
        
        }
       }
        System.out.println("O maior eh " + maiorNum);
    }
    
}
