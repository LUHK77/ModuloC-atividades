/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    public void __construct(String nome,int idade,double altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    
    }
    
    public String getNome(){
    return nome;
    }
    
    public int getIdade(){
    return idade;
    }
    
    public double getAltura(){
    return altura;
    }
    
    public void exibeInfo(Pessoa pe){
        System.out.println("Nome: " + pe.getNome());
        System.out.println("Idade: " + pe.getIdade());
        System.out.println("Altura: " +pe.getAltura());
    }
    
}
