/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sexto;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ex3 {
    
    public static void main(String [] args){
    
        ArrayList<Double>numeros = new ArrayList<>();
        
        for (double i = 1.1;i < 6;i++){
        numeros.add(i);
    
    }
        System.out.println("Este é o terceiro elemento " + numeros.get(2));
    
}
}
