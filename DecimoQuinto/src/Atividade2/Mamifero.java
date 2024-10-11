/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class Mamifero extends Animal {
    
    private String tipoPelo;

    public Mamifero(String tipoPelo, String nome, int idade) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }    

    @Override
    public String toString() {
        return "Mamifero{" + "tipoPelo=" + tipoPelo + '}';
    }
    
}
