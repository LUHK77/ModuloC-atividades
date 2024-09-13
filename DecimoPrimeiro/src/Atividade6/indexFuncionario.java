/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class indexFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.__construct("Eduardo", 1200, "Vendas");
        System.out.println(f.getSalario());
        f.aumentaSalario(300);
        System.out.println(f.getSalario());
    }
}
