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
        Gerente carlos = new Gerente("Vendas","Carlos","Gerente",5700);
        Vendedor valter = new Vendedor(3,"Valter","Vendor",1800);
        
        carlos.Apresentar();
        valter.Apresentar();
        
        
    }
    
}
