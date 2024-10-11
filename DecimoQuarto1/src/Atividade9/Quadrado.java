/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class Quadrado implements Desenho{
    private int tamanho;

    public Quadrado(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void desenhar() {
        System.out.println("Voce desenhou um quadrado de tamanho " + this.tamanho);
    }
    
}