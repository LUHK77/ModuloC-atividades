/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Aluno
 */
public class mainConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ContaCorrente c = new ContaCorrente("Cleber", 12231,1500);
      
      c.depositar(300);
      c.sacar(1000);
    }
    
}
