/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade18;

/**
 *
 * @author Aluno
 */
public class Vendedor implements Funcionario{
    
    private String nome;
    private double salarioPorDia;

    public Vendedor(String nome, double salarioPorDia) {
        this.nome = nome;
        this.salarioPorDia = salarioPorDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorDia() {
        return salarioPorDia;
    }

    public void setSalarioPorDia(double salarioPorDia) {
        this.salarioPorDia = salarioPorDia;
    }

    @Override
    public double calcularSalario(int dias) {
       double valor = this.salarioPorDia * dias;
       return valor;
    }

    @Override
    public void gerarFolhaPagamento(int dias) {
        System.out.println("Voce recebeu esse mes R$" + calcularSalario(dias));
    }
}