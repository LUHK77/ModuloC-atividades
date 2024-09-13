/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Aluno
 */
public class Retangulo {
    public double base;
    public double altura;
    
    public void __construct(double base, double altura){
    this.base = base;
    this.altura = altura;
    }
    
    public double getBase(){
    return base;
    }
    
    public double getAltura(){
    return altura;
    }
    
    public void calculaArea(){
        System.out.println(base * altura);
    }
    
     /*public double calculaArea(Retangulo re){
    Double Area = re.getAltura() * re.getBase();
    return Area;
    }*/
    
}
