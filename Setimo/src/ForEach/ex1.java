/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

/**
 *
 * @author Aluno
 */
public class ex1 {
    public static void main(String[] args) {
        int numeros[] = {4,6};
        int resultado = 0;
        
        for (int numero : numeros){
        
            resultado += numero;
    }
        System.out.println(resultado);  
}
}