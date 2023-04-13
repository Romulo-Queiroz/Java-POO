package com.mycompany.olamundo;

public class Mamifero extends Animal{
    private String corDaPele;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Mamifero");
    }
}
