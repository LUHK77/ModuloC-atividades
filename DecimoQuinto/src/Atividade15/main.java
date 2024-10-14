/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade15;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Filme sherek2 = new Filme("Caio","Comedia","Sherek 2","2:30");
        Jogo terraria = new Jogo("Loki","Pc, mobile, console","Terraria","100:00");
        
        sherek2.exibirInfo();
        System.out.println("------------------------");
        terraria.exibirInfo();
    }
    
}
