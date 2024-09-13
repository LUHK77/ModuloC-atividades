/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Aluno
 */
public class indexBanco {
    
    
    public static void main(String[] args) {
        ContaBancaria julio1 = new ContaBancaria();
        julio1.__construct("087.987.122-23", 1000, "julio");
        julio1.depositar(200);
        System.out.println(julio1.getSaldo());
        julio1.sacar(400);
        System.out.println(julio1.getSaldo());
        
    }
    
    
    
}
