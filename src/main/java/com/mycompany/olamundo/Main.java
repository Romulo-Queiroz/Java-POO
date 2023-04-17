package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video ("POO JAVA");
        v[1] = new Video ("CURSO EM VIDEO");
        v[2] = new Video ("GUSTAVO GUANABARA");




        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Romin", "Romulo", 25, "Masculino");

        Visualizacao view = new Visualizacao(g[0],v[2]);

        System.out.println(g[0].getNome());
        //System.out.println(view.toString()); erro
        System.out.println(g[0]);
    }
}