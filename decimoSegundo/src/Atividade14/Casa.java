/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade14;

/**
 *
 * @author Aluno
 */
public class Casa {
    
    private int numero;
    private String cor;
    private Pessoa propretario;

    public Casa(int numero, String cor, Pessoa propretario) {
        this.numero = numero;
        this.cor = cor;
        this.propretario = propretario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPropretario() {
        return propretario.getNome();
    }

    public void setPropretario(String propretario) {
        this.propretario.setNome(propretario);
    }
    
    
    
}
