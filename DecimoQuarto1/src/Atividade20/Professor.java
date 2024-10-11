/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade20;

/**
 *
 * @author Aluno
 */
public class Professor implements Pessoa{
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome+ " " + disciplina.mostrarDisiplina() + '}';
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }
    
    
    
}
