/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>animais = new ArrayList<>();
        
        
        animais.add("garsa");
        animais.add("leao");
        animais.add("onca");
        animais.add("macaco");
        animais.add("elefante");
        
        ArrayList<String>animais2 = new ArrayList<>(animais.size());
        
        
        animais2.addAll(animais);
        
        
        System.out.println(animais2);
        
        
        
    }
    
}
