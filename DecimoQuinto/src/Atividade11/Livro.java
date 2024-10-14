/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade11;

/**
 *
 * @author Aluno
 */
public class Livro extends Produto {
    
    private String autor;

    public Livro(String autor, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Autor: " + getAutor());
    } 
}
