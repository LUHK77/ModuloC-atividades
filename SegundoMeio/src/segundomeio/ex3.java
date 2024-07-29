/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex3 {
    public static void main(String [] args) {
    int num[] = new int [10];
    int numUsuario; 
    int encontrado = 0;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 100");
        numUsuario = teclado.nextInt();
        
    
    for(int i = 0;i< num.length; i++){
    num[i] = (int) (Math.random() * 100) + 1;
        System.out.println(num[i]);
        
        if(num[i] == numUsuario){
        encontrado++;
        }
       
    }
     if(encontrado == 1){   
        System.out.println("Foi encontrado " + encontrado + " vez o seu numero");
     } else {
         System.out.println("Foi encontrado " + encontrado + " vezes o seu numero");
     }
    
  }
    
}
