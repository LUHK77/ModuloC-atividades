/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double altura;
        double largura;
        
        System.out.println("Digite a altura da parede em metros");
        altura = teclado.nextDouble();
        System.out.println("Digite largura da parede em metros");
        largura = teclado.nextDouble();
        double area = altura * largura;
        double litros = area / 2;
        
        System.out.println("A area da sua parede eh: " + area + "m e a quantidade de litros eh: " + litros + "L");
        
    
    }
    
}
