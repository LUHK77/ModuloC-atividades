/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade14;

/**
 *
 * @author Aluno
 */
public class Show extends Evento{
    private String cantor;

    public Show(String cantor, String nome, String data) {
        super(nome, data);
        this.cantor = cantor;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    
    

    @Override
    public void apresentar() {
        System.out.println("Cantor: " + getCantor());
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getData());
    }
}
