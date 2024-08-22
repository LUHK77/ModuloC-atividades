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
public class ex16 {

    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>(Arrays.asList("maca", "banana", "pera", "melancia", "uva", "abacate"));
        HashSet<String> frutas2 = new HashSet<>(Arrays.asList("cacau", "acai", "pera", "cereja", "tomate", "melancia"));

        for (String fruta1  : frutas) {
            for (String fruta  : frutas2) {
                if(fruta == fruta1){
                    System.out.println("A fruta " + fruta + " pertence aos dois Hashs");
                }
            }
        }

    }

}
