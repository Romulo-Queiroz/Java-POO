
package com.mycompany.olamundo;


public class ContaBanco {
    //atributos
    
    public int numDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumDaConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    //constructor
    
    public ContaBanco() {
    saldo = 0;
    status = false;
}
    
    //getters setters
    
    public void setNumDaConta(int n){
        this.numDaConta = n;
    }
    
    public int getNumDaConta(){
        return numDaConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return status;
    }
    
    //Métodos 
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "cc")
        {
            this.saldo = 50;  //setSaldo(50);
        }
        else if(t == "p")
        {
            this.setSaldo(150);
        }
              
    }
    
    public boolean fecharConta(){
        if(saldo < 0 && saldo >0)
        {
            System.out.println("Para fechar a sua conta você precisa estar com saldo igual a ZERO");
            return status = true;
        }
        else if(saldo == 0)
        {
            System.out.println("Conta finalizada com sucesso");
           
        }
        return status = false;   //setStatus(false);
    }
    
    public void depositar(float v){
        if (this.status == true){
            this.saldo = this.saldo + v;
        }else
        {
            System.out.println("Você precisa abrir uma conta antes");
        }
        
    }
    
    public void sacar(float v){
        if (status == true)
        {
         if(this.saldo > v){
            this.saldo = this.saldo - v;
         }
         else{
             System.out.println("Erro: Saldo negativo");
         }
        }
        else {
            System.out.println("Abra uma conta antes");
        }
    }
    
    public void pagarMensal(){
       int v;
       if (this.getTipo()=="cc"){
           v = 12;
       }else if(this.getTipo() == "p"){
           v = 20;
       }
       if (this.getStatus()) {
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidadde paga com sucesso por: " + this.dono);
       }else {
           System.out.println("Impossível pagar");
       }
    }
}
