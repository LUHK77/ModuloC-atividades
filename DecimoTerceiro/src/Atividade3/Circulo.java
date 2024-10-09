/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Circulo implements FormaGeometrica {
    
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

    @Override
    public void calculaArea() {
      double result = 3.14 * (this.raio*this.raio);
        System.out.println(result);
    }

    @Override
    public void calculaPerimetro() {
     double result = 2 * 3.14 * this.raio;
        System.out.println(result);
    }
    
    
    
}
