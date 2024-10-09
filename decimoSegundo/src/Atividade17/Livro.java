/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade17;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao; 

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Livro(String titulo,String autor,int anoPublicacao){
       this.titulo = titulo;
       this.autor = autor;
       this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getanoPublicacao() {
        return anoPublicacao;
    }

    public void setAno(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}
