/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade17;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca",60,79.89);
        Moto xj = new Moto("XJ77",70,56.78);
        
        fusca.alugar();
        fusca.devolver();
        System.out.println(fusca.calcularValorAluguel(6));
        System.out.println("-----------------------------------------------------------");
        xj.alugar();
        xj.devolver();
        System.out.println(xj.calcularValorAluguel(9));
    }
}
