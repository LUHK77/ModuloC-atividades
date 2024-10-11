/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Aluno
 */
public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(double saldo, String numero) {
        this.saldo = saldo;
        this.numeroConta = numero;
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
       double taxa = valor + (valor*0.10);
       this.saldo -= taxa;
        System.out.println("Voce sacou R$" + valor +" seu saldo atual eh de R$" + this.saldo);
    }

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
        System.out.println("Voce Depositou R$" + valor);
    }
    
}