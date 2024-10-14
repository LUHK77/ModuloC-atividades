/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class Radio extends EletroDomestico {
    
    private int volume;

    public Radio(int volume, String marca, String modelo, boolean ligado) {
        super(marca, modelo, ligado);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    

    @Override
    public void ligar() {
       setLigado(true);
        System.out.println("Voce ligou o radio");
    }

    @Override
    public void desligar() {
        setLigado(false);
        System.out.println("Voce desligou o radio");
    }
    
    public void aumentarVolume(){
     this.volume += 10;
        System.out.println("Voce aumentou o volume");
    }
    
}
