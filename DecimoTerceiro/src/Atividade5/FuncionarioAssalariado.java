/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Aluno
 */
public class FuncionarioAssalariado implements Pagavel {
    private String nome;
    private double salario;

    public FuncionarioAssalariado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void calculaPagamento() {
        double pagamento = this.salario - (this.salario*0.1);
        System.out.println("Seu pagamento eh R$" + pagamento);
    }
    
    
    
}
