package com.mycompany.olamundo;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String login, String nome, int idade, String sexo) {
         super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = totAssistido;
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
