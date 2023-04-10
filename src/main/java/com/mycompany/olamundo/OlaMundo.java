package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
  
      p[0] = new Pessoa("Joao",13, "Masculino");
      p[1] = new Pessoa("Maria",33, "Feminino");
      
      Livro[] l = new Livro [3];
      
      l[0] = new Livro("Aprendendo Javinha", "Gustavo Guanabara", 233, 66,p[0]);
      l[1] = new Livro ("Java book", "Romulo Queiroz", 459, 99, p[1]);
      
      System.out.println("Nome do professor: " + l[0].getAutor());
      System.out.println("Nome do aluno: "+p[0].getNome());
      
     
      System.out.println("Olá " + p[1].getNome() + "você esta lendo" + l[0].getTitulo());

    }
     
}
