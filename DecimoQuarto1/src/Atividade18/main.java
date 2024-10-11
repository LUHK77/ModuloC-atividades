/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade18;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Gerente jorge = new Gerente("jorge",240);
        Vendedor valter = new Vendedor("valter",87.22);
        
        jorge.gerarFolhaPagamento(30);
        valter.gerarFolhaPagamento(20);
    }
}
