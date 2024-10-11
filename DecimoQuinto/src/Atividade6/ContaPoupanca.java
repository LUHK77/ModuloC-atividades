/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(double taxa, String numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public void Apresentar() {
        System.out.println("\nNumero da Conta: " + getNumeroConta());
        System.out.println("\nSaldo: R$" + getSaldo());
        System.out.println("\nTaxa R$: " + getTaxa());
    }
}
