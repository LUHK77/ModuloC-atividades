/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade9;

/**
 *
 * @author Aluno
 */
public class indexFuncionario {
    public static void main(String[] args) {
        Funcionario cleber = new Funcionario("Cleber",1500,"Vendas");
        cleber.aumentaSalario(20);
        System.out.println(cleber.getSalario());
    }
    
}
