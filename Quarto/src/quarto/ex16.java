/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int genero[] = new int[5];
        int homem = 0;
        int mulher = 0;
        int idades[] = new int[5];
        int idadeHomem = 0;
        int idadeMulher = 0;
        int soma = 0;

        for (int i = 0; i < genero.length; i++) {
            System.out.println("Digite o valor 0 para masculino e o valor 1 para feminino");
            genero[i] = teclado.nextInt();
            System.out.println("Digite a idade consecutivamente dos generos");
            idades[i] = teclado.nextInt();
            soma += idades[i];
            if (genero[i] == 0) {
                homem++;
                idadeHomem += idades[i];
            }
            if (genero[i] == 1) {
                mulher++;
            if(idades[i] >= 20){
            idadeMulher++;
            if(idadeMulher == 0){
            idadeMulher = idades[i]; 
                }
            }
        }


    }
        
        double media = soma / genero.length;
        double mediaHomens = idadeHomem / homem;
        
        System.out.println("Foram cadastrados " + homem + " homens, e " + mulher + " mulheres. A media das idades eh " + media + " anos");
        System.out.println("A media das idades dos homens eh " + mediaHomens + " anos, e a quantia de  mulheres com mais de 20 eh " + idadeMulher);
  }
    
    
}
