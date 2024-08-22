/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ex19_incompleto {

    public static void main(String[] args) {
        HashSet<String> palavras = new HashSet<>(Arrays.asList("wertr", "zuei", "jonas"));
        
        
        for (String palavra : palavras) {
            int resultado = 0;
            
            int resultadoReal = 0;
            int i = palavra.length();
            resultado = i * (i - 1);
            System.out.println(resultado);
            i --;
            while (i > 0) {
                
               
                resultadoReal += resultado * (i - 1);
                System.out.println(resultado + "x" + (i-1) + "=" + resultadoReal);
                i--;
        
            
            }
            System.out.println("--"+resultadoReal);
        }

    }
}
