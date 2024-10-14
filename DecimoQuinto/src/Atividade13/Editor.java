/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade13;

/**
 *
 * @author Aluno
 */
public class Editor extends Usuario {
    
    private String nivelAcesso;

    public Editor(String nivelAcesso, String nome, String login) {
        super(nome, login);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
   public void editor(){
       System.out.println("Editando Usuario....");
   }
   
   public void leitura(){
       System.out.println("Lendo arquivo....");
   }
    
}
