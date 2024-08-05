/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Aluno
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        
        for(int i = 0;i < 11; i++){
        int numero = (int)(Math.random()*100) + 1;
        numeros.add(numero);
        }
        
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
    }
    
}
