/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade15;

/**
 *
 * @author Aluno
 */
public class Filme extends Midia{
    private String diretor;
    private String genero;

    public Filme(String diretor, String genero, String nome, String duracao) {
        super(nome, duracao);
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Diretor: " + getDiretor());
    }
    
    
    
}
