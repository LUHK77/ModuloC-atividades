/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForEach;

/**
 *
 * @author Aluno
 */
public class ex4 {
    public static void main(String[] args) {
        double notas[] = {6.3,8.2,5.9};
        double soma = 0;
        double media;
        for(double nota : notas){
        soma += nota;
            
        }
        media = soma/notas.length;
        System.out.println("A media eh " + media);
    }
    
}
