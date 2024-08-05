/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexto;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String>frutas = new ArrayList<>();
       
       frutas.add("maca");
       frutas.add("banana");
       frutas.add("manga");
       frutas.add("ameixa");
       frutas.add("acerola");
       
       frutas.set(2, "morango");
       
        System.out.println(frutas);
       
    }
    
}
