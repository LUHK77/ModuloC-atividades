/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Radio r = new Radio(50,"tenta","eletenta",false);
        Geladeira gege = new Geladeira(-10,"Brastemp","Brastemp 009",false);
        
        r.aumentarVolume();
        r.ligar();
        r.desligar();
        System.out.println("--------------------------------------");
        gege.ligar();
        gege.desligar();
    }
    
}
