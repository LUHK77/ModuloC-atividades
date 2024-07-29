/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

/**
 *
 * @author TI
 */
public class ex6 {
     public static void main(String[] args) {
         for(int i = 30;i >= 0; i--){
             int valorI = i%4;
             if(valorI == 0){
                 System.out.println("["+i+"]");
             } 
             else {
                 System.out.println(i);
             }
         }
     }
}
