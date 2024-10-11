/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade17;

/**
 *
 * @author Aluno
 */
public class Moto implements Veiculo {
    
    private String modelo;
    private double velocidade;
    private double valorDiario;

    public Moto(String modelo, double velocidade,double valorDiario) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.valorDiario = valorDiario; 
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
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
    public void alugar() {
        System.out.println("Voce alugou o moto " + this.modelo);
    }

    @Override
    public void devolver() {
        System.out.println("Voce devolveu o moto " + this.modelo);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        double valor = dias * this.valorDiario;
        return valor;
    }
}