/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex17 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    double velocidade, valor, velocidadeMais;
    System.out.println("Qual a velocidade do carro");
    velocidade = teclado.nextDouble();
    
    if(velocidade > 80){
    velocidadeMais = velocidade - 80;
    valor = velocidadeMais * 5;
    System.out.println("Sua multa eh: " + valor + "R$");
    } else {
    System.out.println("Ta liberado");
    }
    
    }
    
}
