package sexto;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String>cores = new ArrayList<String>();
       
       cores.add("vermelho");
       cores.add("verde");
       cores.add("azul");
       
        System.out.println("As cores possuem a cor amarela: " + cores.contains("Amarelo"));
        System.out.println("As cores sao " );
        System.out.println(cores);
       
       
    }
    
}
