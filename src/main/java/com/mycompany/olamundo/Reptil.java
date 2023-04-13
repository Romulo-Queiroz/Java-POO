package com.mycompany.olamundo;

public class Reptil extends Animal{
    private String corDaEscama;
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendom Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Reptil");
    }
}
