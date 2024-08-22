/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ex2 {
    public static void main(String[] args) {
        ArrayList<String>palavras = new ArrayList<>(Arrays.asList("cavalo","cobra","vaca","jorge"));
        
        for (String palavra : palavras){
            String toUpperCase = palavra.toUpperCase();
        System.out.println(toUpperCase);
        }
        
    }
    
}
