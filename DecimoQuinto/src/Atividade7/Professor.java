/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    
    private String materia;

    public Professor(String materia, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void Apresentar() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nIdade: " + getIdade());
        System.out.println("\nEndereco: " + getEndereco());
        System.out.println("\nDisiplina : " + getMateria());
    }
    
}
