/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca","Fusca 121",1987,4);
        Moto xj = new Moto("XJ","XJ882",2008,2);
        Caminhao uno = new Caminhao("Fiati","fiat uno 288",2001,2,4);
        
        fusca.exibeInfo();
        System.out.println("------------------------------------------");
        uno.exibeInfo();
        System.out.println("------------------------------------------");
        xj.exibeInfo();
    }
    
}
