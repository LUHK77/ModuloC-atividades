/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculo {
    private int numAcentos;
    
    public Moto(String marca, String modelo, int ano,int numAcentos) {
        super(marca, modelo, ano);
        this.numAcentos = numAcentos;
    }

    public int getNumAcentos() {
        return numAcentos;
    }

    public void setNumAcentos(int numAcentos) {
        this.numAcentos = numAcentos;
    }
    
    public void exibeInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de Acentos: " + getNumAcentos());
    }
}
