/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade11;

/**
 *
 * @author Aluno
 */
public class Televisao {
    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void trocarDeCanal(int canal){
       this.canal = canal;
        System.out.println("Voce trocou pro canal " + canal);
    }
    
    public void diminuirVolume(int volume){
     this.volume -= volume;
        System.out.println("Voce diminuiu para o volume " + this.volume);
    }
    
    
}
