package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {

      Professor professor1 = new Professor("Gustavo", 33,"Masculino");
      Aluno aluno1 = new Aluno("Rômulo", 25, "Masculino");

      professor1.setAssuntoAula("Aprendendo Herança usando JAVA.");
      aluno1.setMatricula(3366);

      System.out.println(professor1.getAssuntoAula() + "E nosso aluno de matrícula: " + aluno1.getMatricula() + " esta acompanhando perfeitamente.");
    }
}
