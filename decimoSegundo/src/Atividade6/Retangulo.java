/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class Retangulo {
    
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public void calculaArea(){
    double area = altura * largura;
        System.out.println("A area deste retangulo eh " + area);
    }
    
      public void calculaPerimetro(){
    double perimetro = (2 * altura) + (2 * largura);
        System.out.println("O perimetro deste retangulo eh " + perimetro);
    }
    
}
