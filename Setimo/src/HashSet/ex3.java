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
public class ex3 {
    public static void main(String[] args) {
       HashSet<Integer>num = new HashSet<>(Arrays.asList(1,2,87,4,7));
       
       num.clear();
       boolean vazio = num.isEmpty();
       
        System.out.println("A lista esta vazia: " + vazio);
    }
    
}
