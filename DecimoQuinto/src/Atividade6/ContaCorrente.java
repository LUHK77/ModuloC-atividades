/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class ContaCorrente extends Conta {
    
    private double limite;

    public ContaCorrente(double limite, String numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void Apresentar() {
        System.out.println("\nNumero da Conta: " + getNumeroConta());
        System.out.println("\nSaldo: R$" + getSaldo());
        System.out.println("\nLimite R$: " + getLimite());
    }
}
