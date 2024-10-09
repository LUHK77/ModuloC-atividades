/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class indexPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa carlos = new Pessoa();
       carlos.__construct("Carlos", 18, 1.75);
        System.out.println(carlos.getNome());
        System.out.println(carlos.getIdade());
        System.out.println(carlos.getAltura());
        
        carlos.setNome("Carlos henrique");
        carlos.setIdade(19);
        carlos.setAltura(1.76);
        
         System.out.println(carlos.getNome());
        System.out.println(carlos.getIdade());
        System.out.println(carlos.getAltura());
    }
    
}
