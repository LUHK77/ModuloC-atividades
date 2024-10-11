/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {

    public Vendedor(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

    @Override
    public void calcularBonus() {
       double bonus = this.salario * 0.10;
        System.out.println("Bonus: R$" + bonus);
    }
    
}
