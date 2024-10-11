/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class Moto implements Veiculo {
    
    private String modelo;

    public Moto(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("Voce deu partida na moto");
    }
    
    
    
}
