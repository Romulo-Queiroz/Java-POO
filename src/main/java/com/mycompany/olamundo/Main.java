package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {

       Cachorro dog = new Cachorro();
       dog.reagir(true);
       System.out.println(dog);

       dog.reagir(5);
        System.out.println(dog);

        //polimorfismo de sobrecarga. O método tem assinaturas diferentes
    }
}