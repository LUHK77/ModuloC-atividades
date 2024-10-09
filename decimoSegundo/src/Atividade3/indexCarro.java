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
        
    Carro fusca = new Carro("fusca","folkisvaign",2012,true);
    fusca.ligar();
    fusca.desligar();
    fusca.acelerar();
    
    System.out.println(fusca.toString());
        }
    
    
}
