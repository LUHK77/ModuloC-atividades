/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class ex15 {
    public static void main(String[] args) {
        //Cria o Array
        ArrayList<String>lista = new ArrayList<>(Arrays.asList(
                "Alberto", "Berilda", "Cartinda", "Fabiana", "Jurtes", "Ordinda"
        ));
        
        //Inverte a ordem do array
        Collections.reverse(lista);
        
        //Exibe o Array
        System.out.println(lista);
        
    }
}
