/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex23 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    int genero;
    String nome;
    
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Digite 0 se voce for homen e 1 se for mulher.");
        genero = teclado.nextInt();
        
        if(genero == 0){
            System.out.println("Ola " + nome +" hoje estamos comemorando o dia da mulher,mas todos tem descontos!!!"
                    + " Hoje voce tem 5% de desconto em todas as compras :)");
        }
        
        if(genero == 1){
            System.out.println("Ola " + nome + " Parabens, hoje estamos comemorando o dia da mulher, voce tem 13% de desconto em qulaquer compra :)");
        }
    
    
    }
    
}
