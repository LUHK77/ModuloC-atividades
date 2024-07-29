/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terceiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Terceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual seu peso");
        peso = teclado.nextDouble();
        System.out.println("Qual seu altura");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC E: %.2f\n", imc);
        
        
        if(imc < 17) {
            System.out.println("Muita abaixodo peso");
          }
        else if(imc >= 17 && imc < 18.5) {
            System.out.println("abaixo do esperado");
          }
        
         else if(imc >= 18.5 && imc < 25) {
            System.out.println("Parabens seu imc ta no peso ideal");
          }
        
         else if(imc >= 25 && imc < 30) { 
           System.out.println("Sobrepeso, va para uma academia");
         }
         
         else if(imc >= 30 && imc < 35) {
           System.out.println("Odesidade, recomendo procurar alguma ajuda");
         }
         
         else if(imc >= 35 && imc < 40)  {
           System.out.println("Obesidade Severa, procure ajuda imediatamente");
         }
         
         else {
           System.out.println("Obesidade morbida");
           
         } 
    }  
}
