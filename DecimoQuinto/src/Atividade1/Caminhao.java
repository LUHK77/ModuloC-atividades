/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class Caminhao extends Carro {
    
    private double carga;
    public Caminhao(String marca, String modelo, int ano, int numPortas,double carga) {
        super(marca, modelo, ano, numPortas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    public void exibeInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de Portas: " + getNumPortas());
        System.out.println("Carga: " + getCarga());
    }
    
    
}
