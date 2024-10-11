/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class Repitil extends Animal{
    
    private String tipoEscama;

    public Repitil(String tipoEscama, String nome, int idade) {
        super(nome, idade);
        this.tipoEscama = tipoEscama;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Repitil{");
        sb.append("tipoEscama=").append(tipoEscama);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
