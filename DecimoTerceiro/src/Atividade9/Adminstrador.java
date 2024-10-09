/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class Adminstrador implements ContaUsuario {
    
    private String nome;

    public Adminstrador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Voce entrou no sistema");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Voce realizou uma operacao");
    }
    
    
    
}
