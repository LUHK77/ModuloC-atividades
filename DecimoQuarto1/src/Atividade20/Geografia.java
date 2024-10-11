/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade20;

/**
 *
 * @author Aluno
 */
public class Geografia implements Disciplina{
    private String nome;

    public Geografia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String mostrarDisiplina() {
        return "Disciplina: " + getNome();
    }
    
    
}
