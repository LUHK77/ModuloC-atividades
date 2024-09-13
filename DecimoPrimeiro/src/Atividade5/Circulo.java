/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Aluno
 */
public class Circulo {
    private double raio;
    
    public void __construct(double raio){
    this.raio = raio;
    }
    
    public void calculaCircunferencia(){
        System.out.println("A circunferencia do circulo eh: " + (2 *raio*3.14));
    }
    
}