/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade10;

/**
 *
 * @author Aluno
 */
public class Cubo extends FiguraGeometricaEspacial {
    
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void calcularVolume() {
       double resposta = this.aresta * this.aresta * this.aresta;
        System.out.println("Volume: " + resposta);
    }
    
    
    
}
