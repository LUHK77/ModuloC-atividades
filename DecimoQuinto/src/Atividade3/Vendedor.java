/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(double comissao, String nome, String cargo, double salario) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public void Apresentar() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nCargo: " + getCargo());
        System.out.println("\nSalario: " + getSalario());
        System.out.println("\nComissao : " + getComissao());
    }
    
}
