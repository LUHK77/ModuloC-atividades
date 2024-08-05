/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


/**
 *
 * @author Aluno
    */
   public class ex9 {

       /**
        * @param args the command line arguments
        */
          public static void main(String[] args) {
           ArrayList<Integer>numeros = new ArrayList<>();
            HashSet<Integer>numerosNaoDuplicados = new HashSet();

           Collections.addAll(numeros,1,2,3,3,5,5,7,2,7);
           numerosNaoDuplicados.addAll(numeros);

           boolean hash = numerosNaoDuplicados.size() != numeros.size();

            if(hash == true){
               System.out.println("A numeros duplicados");
             } else {
               System.out.println("Nao a numeros suplicados");
             }


           }

       }



