/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
public class ex6 {
    public static void main(String [] args){
     int num[] = new int [10];
        
        for(int i = 0;i<num.length;i++){
        num[i] = (int) (Math.random() * 100) + 1;
            System.out.println(num[i]);
        
        }
        System.out.println("Invertido-------------------------");
        
        for(int i = num.length -1;i >= 0; i--){
            System.out.println(num[i]);
        }}
    
}
