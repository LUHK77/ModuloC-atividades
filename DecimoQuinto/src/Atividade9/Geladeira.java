/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class Geladeira extends EletroDomestico {
    private double temperatura;

    public Geladeira(double temperatura, String marca, String modelo, boolean ligado) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Voce ligou a geladeira");
    }

    @Override
    public void desligar() {
        setLigado(true);
        System.out.println("Voce desligou a geladeira");
    }
    
}
