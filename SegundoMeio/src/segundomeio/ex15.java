/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
    public class ex15 {
        public static void main(String[] args){
        double numeros[] = new double[10];
        double soma = 0;
        double somaVariancia = 0;
        
        

        for(int i = 0; i < numeros.length;i++){
            numeros[i] = (double) (Math.random() * 100) + 1;
            soma += numeros[i];
            
        }
        double media = soma / numeros.length;
       
        for(int i = 0; i < numeros.length;i++){
        somaVariancia += Math.pow((numeros[i] - media), 2)/numeros.length;
       }
        double desvio = Math.sqrt(somaVariancia);
        
            System.out.printf("A soma eh %.2f", soma);
            System.out.printf(", a media eh %.2f", media);
            System.out.printf(", a variancia eh %.2f", somaVariancia);
            System.out.printf(" e o desvio eh %.2f", desvio);
        
   }

}
