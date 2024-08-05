/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex13 {
    public static void somaDeArraysSemDuplicates(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        ArrayList<Integer>numeros2 = new ArrayList<>();
         
        
        Collections.addAll(numeros,1,2,3,3,5,5,7,2,7,13);
        Collections.addAll(numeros2,1,8,9,11,22,5,7,42,7);
        HashSet<Integer>numerosNaoDuplicados = new HashSet<>(numeros);
        numerosNaoDuplicados.addAll(numeros2);
        System.out.println(numerosNaoDuplicados);
        
        
    }
    
}
