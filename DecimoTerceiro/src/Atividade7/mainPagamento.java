/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class mainPagamento {
    public static void main(String[] args) {
    
    Dinheiro dindin = new Dinheiro(1200);
    CartaoDeCredito nubank = new CartaoDeCredito(1500);
    
    dindin.efetuarPagamento(200);
    
    nubank.efetuarPagamento(300);
    
    }
    
}
