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
public class ex12 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    double valorProduto;
    System.out.println("Digite o valor do produto");
    valorProduto = teclado.nextDouble();
    double desconto = valorProduto / 20;
    double valorDesconto = valorProduto - desconto;
    System.out.println("O produto com desconto eh: " + valorDesconto);
    
    
    }
    
}
