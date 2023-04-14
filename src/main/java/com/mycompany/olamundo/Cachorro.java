package com.mycompany.olamundo;

public class Cachorro extends Animal{

    private int idade;
    private boolean dono;
    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

    public void reagir(int idade){
        if (idade > 3 )
        {
            System.out.println("Tenho MAIS de 3 anos");
        }
        else{
            System.out.println("Tenho MENOS de 3 anos");
        }
    }

    public void reagir(boolean dono){
        if (dono)
        {
            System.out.println("Eu sou o sono");
        }
        else{
            System.out.println("Cachorro latindo, você não é o dono");
        }
    }

}
