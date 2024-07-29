/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundomeio;

import java.util.Random;

/**
 *
 * @author TI
 */
public class SegundoMeio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[10];
        Random numAleatorio = new Random();
        
        
        for(int i = 0;i<num.length;i++){
        num[i] = numAleatorio.nextInt(100);
            System.out.println(num[i]);
        }
    }
    
}
