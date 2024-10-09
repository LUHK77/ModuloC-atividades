/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade15;

/**
 *
 * @author Aluno
 */
public class indexEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado cleber = new Empregado("Cleber","Adm",2000);
        
        System.out.println("Nome: " + cleber.getNome()+ ", Cargo: " + cleber.getCargo() + ", Salario: " + cleber.getSalario());
        
        cleber.calcularBonus(10);
        
        System.out.println("Nome: " + cleber.getNome()+ ", Cargo: " + cleber.getCargo() + ", Salario: " + cleber.getSalario());
    }
    
}
