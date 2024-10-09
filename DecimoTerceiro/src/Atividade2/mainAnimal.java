/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class mainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Bolgo");
        Gato kat = new Gato("tomas");
        Passaro bird = new Passaro("clop");
        
        dog.emitirSom();
        kat.emitirSom();
        bird.emitirSom();
        
    }
    
}
