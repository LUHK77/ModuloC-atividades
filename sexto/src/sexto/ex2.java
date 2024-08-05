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
public class ex2 {
    public static void main(String [] args){
    
    ArrayList<Integer>numeros = new ArrayList<>();
    
    for(int i = 1; i < 11; i++){
    numeros.add(i);
    }
    for (Integer numero : numeros){
        System.out.println(numero);
    }
        System.out.println("------------------------");
    for(int i = 9; i >= 1; i-=2){
    numeros.remove(i);
    }
    for (Integer numero : numeros){
        System.out.println(numero);
    }
    
}

}
