package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        //um objeto da class Caneta
       Visibilidade c1 = new Visibilidade("BIC Constructor", "Preto", "1.2"); 
       c1.setModelo("Modelo um");
            
      c1.carga = 80;
      c1.tampar();
      c1.status();
      c1.rabiscar(); 
    }
}
