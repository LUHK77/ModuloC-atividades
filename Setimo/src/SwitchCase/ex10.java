/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = teclado.nextLine();
        
        
        switch(letra){
        
            case "a","e","i","o","u":
                System.out.println("Uma vogal");
                break;
            default:
                System.out.println("Uma consoante");
        
        }
    }
}
