package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        //um objeto da class Caneta
       Caneta c1 = new Caneta(); 
       //atributos
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       
       //chamando métodos
       c1.tampar(); 
       c1.status();
       c1.rabiscar();
       
       //criando uma outra caneta com outros atributos usando a mesma classe:
       
        //um objeto da class Caneta 
       Caneta caneta2 = new Caneta();
       //atributos
       caneta2.cor = "Vermelha";
       caneta2.ponta = 1.3f;
       
       //chamando métodos
       caneta2.destampar(); 
       caneta2.status();
       caneta2.rabiscar();
       
      Notas note = new Notas();
      note.nota = "Criando texto e fixando";
      note.oQueEUml();
     
      Notas outraNota = new Notas();
      outraNota.contexto 
    }
}
