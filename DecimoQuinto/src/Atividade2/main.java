/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Mamifero chipanze = new Mamifero("pelo grosso","Chipanze",6);
        Ave canario = new Ave("amarelo","Canario",2);
        Repitil lagarto = new Repitil("Escama de Lagarto","Lagarto",3);
        
        System.out.println(canario.toString());
        System.out.println(chipanze.toString());
        System.out.println(lagarto.toString());
    }
    
}
