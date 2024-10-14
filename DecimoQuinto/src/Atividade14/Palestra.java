/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade14;

/**
 *
 * @author Aluno
 */
public class Palestra extends Evento{
    private String palestrante;

    public Palestra(String palestrante, String nome, String data) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
    

    @Override
    public void apresentar() {
        System.out.println("Palestrante: " + getPalestrante());
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getData());
    }
}