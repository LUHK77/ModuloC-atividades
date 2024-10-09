/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade12;

/**
 *
 * @author Aluno
 */
public class indexPorta {
    public static void main(String[] args) {
        Porta porta = new Porta(false,"marrom");
        
        System.out.println("A porta esta aberta: " + porta.isAberto());
        porta.abrir();
        System.out.println("A porta esta aberta: " + porta.isAberto());
        porta.fechar();
        System.out.println("A porta esta aberta: " + porta.isAberto());
    }
    
}
