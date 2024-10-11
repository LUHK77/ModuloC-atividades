/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade20;

/**
 *
 * @author Aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno borgues = new Aluno("borgues","2B");
        Geografia geografia = new Geografia("Geografia");
        Professor piter = new Professor("Jorge",geografia);
        
        borgues.apresentar();
        piter.apresentar();
    }
    
}
