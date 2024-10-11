/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Aluno
 */
public class Notebook extends DispositivoEletronico {
    
    private int armazenamento;

    public Notebook(int armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    public void Apresentar() {
        System.out.println("\nModelo: " + getModelo());
        System.out.println("\nMarca: " + getMarca());
        System.out.println("\narmazenamento: " + getArmazenamento());
    }
    
}
