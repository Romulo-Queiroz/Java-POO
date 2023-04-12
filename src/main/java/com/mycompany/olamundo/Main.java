package com.mycompany.olamundo;

public class Main {

    public static void main(String[] args) {
        // Pessoa pessoa1 = new Pessoa(); pessoa é abstrato e por isso não pode ser instanciado.
        Visitante v1 = new Visitante("Visitante anônimo ", 0,"Indefinido");

        System.out.println("Hello"+ v1.getNome() +"você tem " + v1.getIdade() +" Anos");

        Aluno aluno1 = new Aluno("Rômulo", 25, "Masculino");
        aluno1.setCurso("Engenharia de Software");
        aluno1.setMatricula(2021);
        aluno1.fazerAniversario();

        System.out.println("Você fez aniversário e agora tem " + aluno1.getIdade() + " Anos");