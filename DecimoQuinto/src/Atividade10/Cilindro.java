/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade10;

/**
 *
 * @author Aluno
 */
public class Cilindro extends FiguraGeometricaEspacial {
    
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public void calcularVolume() {
        double resposta = (3.14 * (this.raio * this.raio)) * this.altura;
        System.out.println("Volume: " + resposta);
    }
    
}
