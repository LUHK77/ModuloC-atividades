/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal {
    
    private String corPena;

    public Ave(String corPena, String nome, int idade) {
        super(nome, idade);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" + "corPena=" + corPena + '}';
    }
    
    
    
}
