package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>nomes = new ArrayList<String>(Arrays.asList("algusto", "Louren","cromossomo","paulo","pluto"));
        
        for (String nome : nomes){
        if(nome.startsWith("a") == true){
            System.out.println(nome);
           }
        }
    }
    
}
