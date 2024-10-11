/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String departamento, String nome, String cargo, double salario) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void Apresentar() {
        System.out.println("\nNome: " + getNome());
        System.out.println("\nCargo: " + getCargo());
        System.out.println("\nSalario: " + getSalario());
        System.out.println("\nDepartamento: " + getDepartamento());
    }
    
}
