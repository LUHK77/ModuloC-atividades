/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade20;

/**
 *
 * @author Aluno
 */
public class Aluno implements Pessoa {
     private String nome;
     private String turma;

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", turma=" + turma + '}';
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }
     
    
     
}
