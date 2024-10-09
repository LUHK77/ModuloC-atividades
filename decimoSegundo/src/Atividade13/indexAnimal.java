/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade13;

/**
 *
 * @author Aluno
 */
public class indexAnimal {
    public static void main(String[] args) {
        Animal coelho = new Animal("coelho","mamifero");
        
        System.out.println(coelho.getNome());
         System.out.println(coelho.getEspecie());
         coelho.setNome("CoelhoAzul");
         coelho.setEspecie("Anfibio");
          System.out.println(coelho.getNome());
           System.out.println(coelho.getEspecie());
    }
    
}
