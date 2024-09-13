/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;
    
    public void __construct(String nome,double salario,String departamento){
    this.nome = nome;
    this.salario = salario;
    this.departamento = departamento;
    }
    
    public double getSalario(){
    return salario;
    }
    
    public double aumentaSalario(double aumento){
    double salarioAumentado = salario + aumento;
    return salario = salarioAumentado;
    }
}
