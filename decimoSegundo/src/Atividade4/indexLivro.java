/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Aluno
 */
public class indexLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro meiaNoite = new Livro("meia noite","belo fernades","22-09-2009",true);
        
        meiaNoite.emprestar();
        meiaNoite.devolver();
    }
    
}
