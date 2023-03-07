
package com.mycompany.olamundo;


public class ContaBanco {
    //atributos
    
    public int numDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
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
        setTipo(t);
        setStatus(true);
        if(tipo == "cc")
        {
            this.saldo = 50;  //setSaldo(50);
        }
        else if(tipo == "p")
        {
            setSaldo(150);
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
        if (status == true){
            saldo = saldo + v;
        }else
        {
            System.out.println("Você precisa abrir uma conta antes");
        }
        
    }
    
    public void sacar(float v){
        if (status == true)
        {
         if(saldo > v){
            saldo = saldo - v;
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
       //proxima aula
    }
}
