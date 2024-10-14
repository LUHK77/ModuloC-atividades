/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade15;

/**
 *
 * @author Aluno
 */
public class Jogo extends Midia{
    
    private String plataforma;
    private String Disinvolvedor;

    public Jogo(String plataforma, String Disinvolvedor, String nome, String duracao) {
        super(nome, duracao);
        this.plataforma = plataforma;
        this.Disinvolvedor = Disinvolvedor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDisinvolvedor() {
        return Disinvolvedor;
    }

    public void setDisinvolvedor(String Disinvolvedor) {
        this.Disinvolvedor = Disinvolvedor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Dev: " + getDisinvolvedor());
    }
    
    
    
}
