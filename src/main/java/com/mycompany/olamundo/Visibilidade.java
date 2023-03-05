package com.mycompany.olamundo;

public class Visibilidade {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("modelo:" + this.modelo);
        System.out.println("Uma caneta: "+ this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, não posso rabiscar, detalhes do erro: (caneta com tampa fechada)");
        }else{
            System.out.println("Rabiscando....");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
