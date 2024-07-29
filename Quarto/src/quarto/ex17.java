/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso[] = new double[7];
        double altura[] = new double[7];
        int mais90 = 0;
        int baixo = 0;
        int alto = 0;
        double somaPesos = 0;

        for (int i = 0; i < peso.length; i++) {
            System.out.println("Digite seu peso");
            peso[i] = teclado.nextDouble();
            System.out.println("Digite sua altura");
            altura[i] = teclado.nextDouble();
            somaPesos += peso[i];

            if (peso[i] > 90) {
                mais90++;
            }
            if (peso[i] < 50 && altura[i] < 1.60) {
                baixo++;
            }
            if (peso[i] > 100 && altura[i] > 1.80) {
                alto++;
            }
            
        }
        
           double mediaPeso = somaPesos / peso.length;
            
            System.out.printf("A media de peso foi %.2f\n", mediaPeso + "kg");
            System.out.println("A " + mais90 + " pessoas com mais de 90kg");
            System.out.println("A " + baixo + " pessoas com menos de 1.60m e menos de 50kgs, e a " + alto + " pessoas com mais de 1.80m e mais de 100kgls");


    }

}
