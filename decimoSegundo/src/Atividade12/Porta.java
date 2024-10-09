/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade12;

/**
 *
 * @author Aluno
 */
public class Porta {
    private boolean aberto;
    private String cor;

    public Porta(boolean aberto, String cor) {
        this.aberto = aberto;
        this.cor = cor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void abrir(){
    this.aberto = true;
        System.out.println("Voce abriu a porta!");
    }
    
    public void fechar(){
    this.aberto = false;
        System.out.println("Voce fechou a porta!");
    }
    
}