/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade8;

/**
 *
 * @author Aluno
 */
public class Aluno {

    private String nome;
    private int matricula;
    private int notas[];

    public Aluno(String nome, int matricula, int[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void calculaMedia() {
        int tamanho = notas.length;
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += notas[i];
        }
        double media = soma / tamanho;
        System.out.println(media);
    }

}
