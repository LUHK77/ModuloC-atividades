/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;

    public Carro(String modelo, String marca, int ano,boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar(){
    this.ligado = true;
        System.out.println("O carro esta: " + (this.ligado ? "Ligado" : "Desligado"));
    }
    
    public void desligar(){
    this.ligado = false;
       System.out.println("O carro esta: " + (this.ligado ? "Ligado" : "Desligado"));
    }
    
    public void acelerar(){
    if(this.ligado == true){
        System.out.println("Voce acelerou o carro");
    } else{
        System.out.println("Voce não pode acelerar sem estar com o carro ligado");
     }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", ligado=" + ligado + '}';
    }
    
    
}
