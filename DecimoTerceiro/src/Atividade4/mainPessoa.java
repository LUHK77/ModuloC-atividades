package Atividade4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class mainPessoa {
    public static void main(String[] args) {
        Pessoa cleber = new Pessoa("cleber", 17);
        Pessoa joao = new Pessoa("joao", 29);
        
        cleber.comparaIdade(joao.getIdade());
    }
    
}
