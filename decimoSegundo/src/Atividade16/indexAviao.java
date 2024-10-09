/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade16;

/**
 *
 * @author Aluno
 */
public class indexAviao {
    public static void main(String[] args) {
        Aviao celso = new Aviao("celso", 50,400);
        
        System.out.println("Modelo: " + celso.getModelo() + ", Capacidade: " + celso.getCapacidadePassageiros()+ ", Velocidade: " + celso.getVelocidade());
    }
}
