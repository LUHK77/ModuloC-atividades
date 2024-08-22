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
public class ex14 {
    public static void main(String[] args) {
        
    HashSet<String>paises = new HashSet<>(Arrays.asList("japao","russia","alemanha","portugal","angola"));
    HashSet<String>paises2 = new HashSet<>(Arrays.asList("japao","russia","alemanha","portugal","angola"));
    
    
    boolean contemPais = paises2.containsAll(paises);
    
        System.out.println("A primeira lista de paises contem todos os paises da segunda: " + contemPais);
    
  }

}
