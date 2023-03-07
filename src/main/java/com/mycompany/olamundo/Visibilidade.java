package com.mycompany.olamundo;

public class Visibilidade {
    private String modelo;
    private String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    
    public Visibilidade(String modelo, String cor, String ponta){
    this.modelo = modelo;
    this.cor = cor;
    this.ponta = 1.2;
    }
    
    public void status(){
        System.out.println("modelo:" + this.modelo);
        System.out.println("Uma caneta: "+ this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    

    
    public String getModelo(){
       return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m; 
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
