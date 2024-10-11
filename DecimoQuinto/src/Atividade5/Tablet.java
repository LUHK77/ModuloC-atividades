/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Aluno
 */
public class Tablet extends DispositivoEletronico {
    private int tamanhoTela;

    public Tablet(int tamanhoTela, String marca, String modelo) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
    
    
    
    public void Apresentar() {
        System.out.println("\nModelo: " + getModelo());
        System.out.println("\nMarca: " + getMarca());
        System.out.println("\nTela: " + getTamanhoTela());
    }
    
}
