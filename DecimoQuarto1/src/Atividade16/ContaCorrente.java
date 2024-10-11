/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade16;

/**
 *
 * @author Aluno
 */
public class ContaCorrente implements ContaBancaria{
    private double saldo;
    private String numeroConta;

    public ContaCorrente(double saldo, String numero) {
        this.saldo = saldo;
        this.numeroConta = numero;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "saldo=" + saldo + ", numeroConta=" + numeroConta + '}';
    }
    
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    
  
    @Override
    public void sacar(double valor) {
       this.saldo -= valor;
        System.out.println("Voce sacou R$" + valor);
    }

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
        System.out.println("Voce Depositou R$" + valor);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(toString());
    }
    
}
