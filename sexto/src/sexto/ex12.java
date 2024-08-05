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
    public class ex12 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            ArrayList<String>nomes = new ArrayList<>();
            HashSet<String>nomesDenovo = new HashSet<>();

            Collections.addAll(nomes, "jorge", "cleber", "jerivaldo", "ortinda", "donald trampo");
            Collections.addAll(nomesDenovo, "arthur", "berto", "jerivaldo", "jutasia", "getulio vargas");

            for ( String nome : nomes){
            for (String nomeD : nomesDenovo){
            if(nome.equals(nomeD)){
                System.out.println("Nome achado " + nome);}
            }
          }



        }

    }
