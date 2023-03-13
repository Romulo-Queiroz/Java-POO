
package com.mycompany.olamundo;


public class ControleRemoto implements Controlador{
    //Atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando= false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        System.out.println("Está ligado? " + this.getLigado());
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
       this.getLigado();
       this.getTocando();
       this.getVolume();
       System.out.println("Menu ligado");
    }

    @Override
    public void fecharMenu() {
       System.out.println("Desligando");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado())
        {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0)
        {
            this.setVolume(+50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && (!this.getTocando()))
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
    }
    
   
}
