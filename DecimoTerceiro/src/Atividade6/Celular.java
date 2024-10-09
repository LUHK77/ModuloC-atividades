/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class Celular implements Eletronico {
    private String modelo;
    private boolean ligada;

    public Celular(String modelo, boolean ligada) {
        this.modelo = modelo;
        this.ligada = ligada;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public void ligar() {
        if(this.ligada = true){
            System.out.println("O celular ja esta ligada");
        } else{
        this.ligada = true;
        System.out.println("Voce ligou o celular");
        }
    }

    @Override
    public void desligar() {
       if(this.ligada = false){
            System.out.println("O celular ja esta desligada");
        } else{
        this.ligada = false;
        System.out.println("Voce desligou o celular");
        }
    }
     @Override
    public void estatus() {
         System.out.println("Modelo: " + this.modelo);
         System.out.println("Estado: " + (this.ligada ? "ligada" : "desligada"));
    }
    
}
