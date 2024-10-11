/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Aluno
 */
public abstract class ContaBancaria {
    
    protected double saldo;
    protected String numeroConta;
    
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    
    
    
}
