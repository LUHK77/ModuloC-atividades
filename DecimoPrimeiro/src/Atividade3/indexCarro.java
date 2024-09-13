/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class indexCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.__construct("Volkswagen", "Fusca 1938", 1938, false);
        
        fusca.ligar();
        
        System.out.println("O carro ta ligado:" + fusca.getLigado());
        
        fusca.desligar();
        
        System.out.println("E agr o esta carro ta ligado:" + fusca.getLigado());
    }
    
}
