/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Aluno
 */
public class mainFuncionario {
    public static void main(String[] args) {
        FuncionarioAssalariado cleber = new FuncionarioAssalariado("cleber", 2100);
        FuncionarioHorista joao = new  FuncionarioHorista("joao",117);
        
        cleber.calculaPagamento();
        joao.calculaPagamento();
    }
    
}
