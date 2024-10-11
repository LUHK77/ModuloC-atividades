/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    
    private String matricula;

    public Aluno(String matricula, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void Apresentar() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nIdade: " + getIdade());
        System.out.println("\nEndereco: " + getEndereco());
        System.out.println("\nMatricula : " + getMatricula());
    }
}
