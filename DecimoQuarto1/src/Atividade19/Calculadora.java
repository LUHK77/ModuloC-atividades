/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade19;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    
    public void dividir(double a, int b){
    try {
    double resultado = a / b;
        System.out.println("Resultado: " + resultado);
    } catch(ArithmeticException e){
     System.err.println("Erro: Divisao por zero");
    }
  }
    
}
