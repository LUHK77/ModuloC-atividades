/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade8;

/**
 *
 * @author Aluno
 */
public class Bateria implements InstrumentoMusical {
    private String cor;

    public Bateria(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void tocar() {
        System.out.println("SONS DE BATERIA MUITO HYPE!");  
    }
}
