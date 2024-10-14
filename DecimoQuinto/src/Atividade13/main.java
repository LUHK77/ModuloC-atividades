/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade13;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Leitor ronaldinho = new Leitor("Leitor","Ronaldinho","Soccer123");
        Editor hugio = new Editor("Editor","Hugio","LOLO12");
        
        ronaldinho.leitura();
        System.out.println("--------------------------");
        hugio.leitura();
        hugio.editor();
    }
    
}
