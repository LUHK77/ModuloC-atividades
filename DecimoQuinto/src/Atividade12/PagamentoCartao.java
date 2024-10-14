/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade12;

/**
 *
 * @author Aluno
 */
public class PagamentoCartao extends FormaPagmento{
    
    private double saldo;

    public PagamentoCartao(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processarPagamento(double valor) {
        this.saldo -= valor;
        System.out.println("Voce gastou o valor de no cartao: R$" + valor);
    }
    
}
