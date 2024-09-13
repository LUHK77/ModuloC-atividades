/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    
    
    public void __construct(String marca,String modelo,int ano, boolean ligado){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.ligado = ligado;
    
    }
    
    public boolean getLigado(){
    return ligado;
    }
    
    public boolean ligar(){
    return ligado = true;
    }
    
    public boolean desligar(){
    return ligado = false;
    }
}
