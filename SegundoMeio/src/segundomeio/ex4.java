/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
public class ex4 {
    public static void main(String [] args){
    int num[] = new int[10];
    
    
    
    for (int j = 0; j < num.length; j++){
     num[j] = (int) (Math.random() * 100) + 1;
     System.out.println(num[j]);
     
    }
        
    
        for (int j = 0; j < num.length - 1; j++) {
         for(int i = 0;i < num.length - j - 1; i++){
            if(num[i] > num[i+1]){
            int temp = num[i];
            num[i] = num[i + 1];
            num[i + 1] = temp;
            }
          }
            
        }
        System.out.println("Filtrado---------------");
        
        for(int i =0;i < num.length; i++){
        System.out.println(num[i]);
        }
        
    }
    
}
