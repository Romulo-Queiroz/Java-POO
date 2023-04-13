package com.mycompany.olamundo;

public class Peixe extends Animal{
    public String corDaEscama;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("sem som");
    }
}
