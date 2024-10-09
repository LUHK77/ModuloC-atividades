/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade14;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
    Pessoa carlos = new Pessoa("Carlos");
    
    Casa cs = new Casa(701,"roxa",carlos);
    
        System.out.println("Cor: " + cs.getCor() + ", Numero: " + cs.getNumero() + ", Propretario: " + cs.getPropretario());
        }
    
}
