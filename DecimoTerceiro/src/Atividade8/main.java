/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade8;

/**
 *
 * @author Aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro("Fusca",40);
        Bicicleta bike = new Bicicleta("SSS",18);
        
        car.acelerar();
        car.freiar();
        car.acelerar();
        car.virar();
        System.out.println("-----------------");
        bike.freiar();
        bike.acelerar();
        bike.virar();
    }
    
}
