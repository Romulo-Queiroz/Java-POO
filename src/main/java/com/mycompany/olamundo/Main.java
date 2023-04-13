package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {

        Mamifero cachorro = new Mamifero();
        cachorro.setIdade(3);
        cachorro.setMembros(4);
        cachorro.alimentar();  //polimorfismo
        cachorro.locomover();  //polimorfismo
        cachorro.emitirSom();  //polimorfismo


        Peixe peixinho = new Peixe();
        peixinho.setIdade(4);
        peixinho.setMembros(0);
        peixinho.alimentar();
        peixinho.locomover();
        peixinho.emitirSom();
    }
}