/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void calculaArea(){
    double area = (raio*raio) * 3.14;
        System.out.println("A area eh " + area);
    }
    
    public void calculaCircunferencia(){
    double circunferencia = raio * 3.14 * 2;
        System.out.println("A circunferencia eh " + circunferencia);
    }
    
}
