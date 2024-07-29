/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundomeio;

/**
 *
 * @author TI
 */
public class ex7 {

    public static void main(String[] args) {
        int num[] = new int[10];

        System.out.printf("Numeros totais\n");
         for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100) + 1;
           System.out.printf(num[i] + " ");
          }
        System.out.printf("\nNao repitidos\n");

        for (int i = 0; i < num.length; i++) {
            int tmp = 0;
            for (int j = i; j < num.length - 1; j++) {
                if (num[i] == num[j + 1]) {
                    tmp++;
                }
            }
            if (tmp == 0) {
                System.out.printf(num[i] + " ");

            }

        }

    }

}
