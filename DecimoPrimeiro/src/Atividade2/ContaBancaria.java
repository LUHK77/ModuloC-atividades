/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;
    
    public void __construct(String numeroConta,double saldo,String titular){
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.titular = titular;
    
    }
    
    public String getNumeroConta(){
    return numeroConta;
    }
    
    public Double getSaldo(){
    return saldo;
    }
     
    public String getTitular(){
    return titular;
    }
    
    public double depositar(double valorDeposito){
    double saldoNovo = this.saldo + valorDeposito;
    saldo = saldoNovo;
    return saldoNovo;
    }
    
    public double sacar(double valorSaque){
    double saldoNovo = this.saldo - valorSaque;
    saldo = saldoNovo;
    return saldoNovo;
    }
    
}
