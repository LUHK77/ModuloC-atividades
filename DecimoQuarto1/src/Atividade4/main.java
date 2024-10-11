/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        ContaCorrente jojo = new ContaCorrente(2030,"07122234509");
        ContaPoupança juju = new ContaPoupança(14000,"01224241522");
        
        jojo.depositar(200);
        
        jojo.sacar(300);
        juju.sacar(500);
    }
    
}
