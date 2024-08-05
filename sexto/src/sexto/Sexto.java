/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexto;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Sexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando a lista
        ArrayList<String>listaDeNomes = new ArrayList<String>();
        
        listaDeNomes.add("Jorginho");
        listaDeNomes.add("Cleber");
        listaDeNomes.add("Kondoriano");  
        listaDeNomes.addFirst("Juana");
        listaDeNomes.add("Jobiscleiton");
        
        for (String nome : listaDeNomes){
            System.out.println(nome);
        }
        System.out.println("O quarto nome da lista eh: " + listaDeNomes.get(3));
        
        listaDeNomes.remove("Jorginho");
        System.out.println("-----------------------");
        for (String nome : listaDeNomes){
            System.out.println(nome);
        }
        System.out.println("Tamanho da lista e " + listaDeNomes.size());
        System.out.println("Existe Jorginho na lista? " + listaDeNomes.contains("Jorginho"));
        
        listaDeNomes.clear();
        System.out.println("Lista esta vazia? " + listaDeNomes.isEmpty());
   
    }
    
}
