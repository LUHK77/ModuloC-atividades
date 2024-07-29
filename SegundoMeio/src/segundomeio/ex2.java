/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

import java.util.Random;

/**
 *
 * @author TI
 */
public class ex2 {
    public static void main(String [] args){
    int num[] = new int[10];
    Random numAl = new Random();
    int soma = 0;
    
    for(int i = 0;i < num.length;i++){
    num[i] = numAl.nextInt(100);
    soma += num[i];
    }
        System.out.println("A soma de todos os 10 numeros " + soma);
  }
    
}
