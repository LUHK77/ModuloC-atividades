/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decimoterceiro;

/**
 *
 * @author Aluno
 */
public class Controle implements Controller {
    private int volume;
    private boolean ligado;
    private boolean passandoPrograma;

    public Controle() {
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isPassandoPrograma() {
        return passandoPrograma;
    }

    public void setPassandoPrograma(boolean passandoPrograma) {
        this.passandoPrograma = passandoPrograma;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta passando algum programa? " + this.isPassandoPrograma());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechano menu.....");
    }

    @Override
    public void maisVolume() {
       if(this.isLigado()){
       this.setVolume(this.getVolume() + 10);
       }
    }

    @Override
    public void menosVolume() {
         if(this.isLigado()){
       this.setVolume(this.getVolume() - 10);
       }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
        this.setVolume(0);
      }
    }

    @Override
    public void desligarMudo() {
       if(this.isLigado() && this.getVolume() ==0){
       this.setVolume(50);
       }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isPassandoPrograma())){
         this.setPassandoPrograma(true);
        } else{
            System.out.println("Não conseguiu repodruzir");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isPassandoPrograma())){
         this.setPassandoPrograma(false);
        } else {
            System.out.println("Não conseguiu paussar");
        }
    }
    
}
