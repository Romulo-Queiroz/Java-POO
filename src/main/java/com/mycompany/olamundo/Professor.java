package com.mycompany.olamundo;

public class Professor extends Pessoa{
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
 
    private String assuntoAula;
    private  String humor;
    private  double Salario;
    
    public void receberAumento(double aumento){
        this.Salario +=  aumento;
    }

    public void qualAssuntodaAula(){
        this.assuntoAula = "Gustavo Guanabara ensinando sobre Herança no JAva";
    }

    public void setAssuntoAula( String assunto){
        this.assuntoAula = assunto;
    }
    public String getAssuntoAula(){
        return assuntoAula;
    }

    public void setHumor( String humorAgora){
        this.humor = humorAgora;
    }
    public String getHumor(){
        return humor;
    }
}
