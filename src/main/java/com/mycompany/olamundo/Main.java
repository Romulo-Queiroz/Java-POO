package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video ("POO JAVA");
        v[1] = new Video ("CURSO EM VIDEO");
        v[2] = new Video ("GUSTAVO GUANABARA");

        System.out.println(v[0].toString());

        Gafanhoto Romulo = new Gafanhoto("Romin", "Romulo", 25);
    }
}