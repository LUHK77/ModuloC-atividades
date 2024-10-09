/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class ContaCorrente implements Conta {
    
    private String titulor;
    private int numero;
    private double saldo;

    public ContaCorrente(String titulor, int numero, double saldo) {
        this.titulor = titulor;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitulor() {
        return titulor;
    }

    public void setTitulor(String titulor) {
        this.titulor = titulor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(int valor) {
        this.saldo -= valor;
        System.out.println("Voce sacou: R$" + valor + ", seu saldo atual e de: R$" + this.saldo);
         
    }

    @Override
    public void depositar(int valor) {
         this.saldo += valor;
        System.out.println("Voce depositou: R$" + valor + ", seu saldo atual eh de: R$" + this.saldo);
    }
    
    
    
    
}
