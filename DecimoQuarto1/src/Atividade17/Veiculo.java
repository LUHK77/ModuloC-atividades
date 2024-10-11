/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Atividade17;

/**
 *
 * @author Aluno
 */
public abstract interface Veiculo {
    
    public abstract void alugar();
    public abstract void devolver();
    public abstract double calcularValorAluguel(int dias);
}
