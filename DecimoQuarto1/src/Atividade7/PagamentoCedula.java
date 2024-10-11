/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author Aluno
 */
public class PagamentoCedula extends Pagamento{

    public PagamentoCedula(double saldo) {
        super(saldo);
    }
    

    @Override
    public void processarPagamento(double pagamento) {
        this.saldo -= pagamento;
        System.out.println("Voce pagou com dinheiro o valor de R$" + pagamento);
    }
    
}