/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Gerente jorge = new Gerente("jorge",4000);
        Vendedor valter = new Vendedor("valter",2000);
        
        jorge.calcularBonus();
        valter.calcularBonus();
    }
    
}
