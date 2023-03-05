package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        //um objeto da class Caneta
       Visibilidade c1 = new Visibilidade(); 
       c1.modelo = "BIC learning";
       c1.cor = "Blue";
       //c1.ponta = 0.5;
      
      c1.carga = 80;
      c1.tampar();
      c1.status();
      c1.rabiscar(); 
    }
}
