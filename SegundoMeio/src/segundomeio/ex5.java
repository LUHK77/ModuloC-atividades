/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
public class ex5 {
    public static void main(String [] args){
        int num[] = new int [10];
        int soma = 0;
        int media;
        
        for(int i = 0;i<num.length;i++){
        num[i] = (int) (Math.random() * 100) + 1;
        soma += num[i];
        
        }
        
        media = soma / num.length;
        
        System.out.println("A media eh " + media);
        
        
    
    }
    
}
