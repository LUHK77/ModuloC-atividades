package segundomeio;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TI
 */
public class ex14 {
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    int numeros[] = new int[10];
    int numeroEscolido;
    int indice;
    
    for(int i = 0; i < numeros.length;i++){
        numeros[i] = (int) (Math.random() * 100) + 1;
    }
    
        System.out.println("Escolha um numero de 1 a 100");
        numeroEscolido = teclado.nextInt();
        System.out.println("Escolha um indice do array de 0 a 9");
        indice = teclado.nextInt();
    
    
    if(numeroEscolido == numeros[indice]){
        System.out.println("Voce acertou");
    } else{
        System.out.println("Voce errou");
        System.out.println("O numero era " + numeros[indice]);
    }
    
        
    
  }
}
