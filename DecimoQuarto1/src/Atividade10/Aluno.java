/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade10;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    
    private String sala;

    public Aluno(String sala, String nome, int idade) {
        super(nome, idade);
        this.sala = sala;
    }
    
    

    public String getMateria() {
        return sala;
    }

    public void setMateria(String sala) {
        this.sala = sala;
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
        System.out.println("Aluno{" + "nome=" + nome + ", idade=" + idade + " sala=" + sala + '}');
    }
}
