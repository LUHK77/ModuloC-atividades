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
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         ArrayList<String>paises = new ArrayList<>();
       
       paises.add("mexico");
       paises.add("russia");
       paises.add("alemanha");
       paises.add("brasil");
       paises.add("argentina");
       
        paises.forEach(System.out::println);
    }
    
}
