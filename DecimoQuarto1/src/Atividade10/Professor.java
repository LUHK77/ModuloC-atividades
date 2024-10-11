/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade10;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    
    private String materia;

    public Professor(String materia, String nome, int idade) {
        super(nome, idade);
        this.materia = materia;
    }
    
    

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }  
  
    @Override
    public void apresentar() {
        System.out.println("Professor{" + "nome=" + nome + ", idade=" + idade + " materia=" + materia + '}');
    }
    
}
