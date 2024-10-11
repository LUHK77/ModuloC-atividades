/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade8;

/**
 *
 * @author Aluno
 */
public class JogoVideoGame extends Jogo {

    public JogoVideoGame(String nome) {
        super(nome);
    }

    @Override
    public void jogar() {
        System.out.println("Um jogo audio visual foi iniciado, pegue seus controles para jogar");
    }
    
}
