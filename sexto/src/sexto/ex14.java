/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ex14 {
    public static void main(String[] args) {
        ArrayList<String>palavras1 = new ArrayList<>(Arrays.asList(
                "Guto", "Grifat", "Cassio", "janela", "travesseiro", 
                "Franca", "Colombia", "Jorge", "Cleber", "Tenma"
        ));
        
        for (String palavra : palavras1){
        if(palavra.length() > 5){
            System.out.println(palavra);
        }
        
        }
                
        
    }
    
}
