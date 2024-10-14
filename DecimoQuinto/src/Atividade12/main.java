/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade12;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        PagamentoCartao nubank = new PagamentoCartao(1500);
        PagamentoPix urubu = new PagamentoPix(2000);
        
        nubank.processarPagamento(1436);
        urubu.processarPagamento(1594);
        
        System.out.println(urubu.getSaldo());
        System.out.println(nubank.getSaldo());
    }
    
}
