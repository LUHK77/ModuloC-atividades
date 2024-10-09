/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade8;

/**
 *
 * @author Aluno
 */
public class Carro implements Veiculo{
    private String modelo;
    private double velocidade;

    public Carro(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        this.velocidade *= 2;
        System.out.println("Voce acelerou");
        if(this.velocidade == 0){
         this.velocidade = 50;
        }
    }

    @Override
    public void freiar() {
       this.velocidade = 0;
        System.out.println("Voce freiou");
    }

    @Override
    public void virar() {
        System.out.println("Voce mudou a direção");
    }
    
}
