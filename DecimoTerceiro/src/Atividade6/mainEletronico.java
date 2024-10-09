/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class mainEletronico {
    public static void main(String[] args) {
        Celular android = new Celular("Android", false);
        Tv samsung = new Tv("samsung",false);
        
        android.estatus();
        android.ligar();
        android.estatus();
        android.desligar();
        android.estatus();
        samsung.estatus();
        samsung.ligar();
        samsung.estatus();
        samsung.desligar();
        samsung.estatus();
        
        
    }
    
}
