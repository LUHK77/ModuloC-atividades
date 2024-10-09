/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade17;

/**
 *
 * @author Aluno
 */
public class indexLivro {
    public static void main(String[] args) {
        Livro l = new Livro("livro", "cleber");
        Livro ko = new Livro("livro 2", "kooper", 2000);
        
        System.out.println(l.getTitulo() + " " + l.getanoPublicacao());
        System.out.println(ko.getTitulo() +" "+ ko.getanoPublicacao());
    }
}
