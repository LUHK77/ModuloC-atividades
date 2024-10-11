/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        PagamentoCartao nubank = new PagamentoCartao(1500);
        PagamentoCedula umReal = new PagamentoCedula(1);
        
        umReal.processarPagamento(0.50);
        nubank.processarPagamento(300);
    }
    
}
