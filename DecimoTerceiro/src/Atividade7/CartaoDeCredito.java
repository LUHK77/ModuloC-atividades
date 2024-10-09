/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class CartaoDeCredito implements FormaPagamento {
    
    private double saldo;

    public CartaoDeCredito(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void efetuarPagamento(double valorPagar) {
       this.saldo -= valorPagar;
        System.out.println("Voce pagou no cartao R$" + valorPagar + " voce tem atualmente R$" + this.saldo + " sobrando na sua conta");
    }
    
    
    
}
