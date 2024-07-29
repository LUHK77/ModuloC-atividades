/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
    public class ex10 {
        public static void main(String [] args){
        int numeros[] = new int[10];
        int maior = 0;
        int menor = 0;
        
            System.out.println("Numeros da lista");

        for(int i = 0; i < numeros.length;i++){
            numeros[i] = (int) (Math.random() * 100) + 1;
            if(numeros[i] > maior){
            maior = numeros[i];
            }
            if(menor == 0){
            menor = numeros[i];
            }
            if(numeros[i] < menor){
            menor = numeros[i];
            }

            System.out.printf(numeros[i] + " ");
        }
        
            System.out.printf("\nO maior numero da lista eh " + maior);
            System.out.println("\nO menor numero eh " + menor);
        
        

    }

}
