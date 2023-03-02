package com.mycompany.olamundo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("modelo:" + this.modelo);
        System.out.println("Uma caneta: "+ this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, não posso rabiscar, detalhes do erro: (caneta com tampa fechada)");
        }else{
            System.out.println("Rabiscando....");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
