/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade11;

/**
 *
 * @author Aluno
 */
public class Roupa extends Produto{
    
    private String tamanho;
    
    public Roupa(String nome, double preco,String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Tamanho: " + getTamanho());
    }    
}
