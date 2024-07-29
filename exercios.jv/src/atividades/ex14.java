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
public class ex14 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    
    double distancia;
    int dias;
    
    System.out.println("Digite quantos dias voce usou o carro");
    dias = teclado.nextInt();
    System.out.println("Digite quantos km voce percorreu");
    distancia = teclado.nextDouble();
    
    double valor = (dias * 90) + (distancia * 0.2);
    
    System.out.println("Valor a ser pago eh: " + valor + "R$");
    
    }
    
}
