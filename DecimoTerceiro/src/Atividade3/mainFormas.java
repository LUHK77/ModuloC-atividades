/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class mainFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo bola = new Circulo(12);
        Retangulo bah =  new Retangulo(10,20);
        
        System.out.println("Circulo");
        bola.calculaArea();
        bola.calculaPerimetro();
        System.out.println("----------------------------------------------");
        System.out.println("Triangulo");
        bah.calculaArea();
        bah.calculaPerimetro();
    }
    
}
