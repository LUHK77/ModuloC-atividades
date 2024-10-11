/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade16;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        ContaCorrente toto = new ContaCorrente(2030,"07122234509");
        ContaPoupanca tutu = new ContaPoupanca(14000,"01224241522");
        
        toto.depositar(200);
        
        toto.sacar(300);
        tutu.sacar(500);
        
        toto.mostrarInformacoes();
        tutu.mostrarInformacoes();
    }
    
}
