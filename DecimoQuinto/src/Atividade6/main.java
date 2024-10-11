/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        ContaPoupanca rob = new ContaPoupanca(400,"40188766212",7000);
        ContaCorrente jor = new ContaCorrente(2000,"08777622113",5000);
        
        rob.Apresentar();
        jor.Apresentar();
    }
    
}
