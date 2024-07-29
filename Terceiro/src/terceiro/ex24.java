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
public class ex24 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    double distancia, pagar;
    double taxa = 0.50;
    
    
        System.out.println("Qual distancia voce percorreu em kilometros");
        distancia = teclado.nextDouble();
        
        if(distancia >= 200){
        pagar = distancia * (taxa -0.05);
            System.out.println("O valor que voce vai pagar eh de " + pagar + "R$, um desconto de 10% pela grande viagem :)");
        } else {
        pagar = distancia * taxa;
        System.out.println("O valor que voce vai pagar eh de " + pagar + "R$");
    }
        
    
  }
}
    
