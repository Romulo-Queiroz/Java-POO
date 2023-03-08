package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
    
      p1.setNumDaConta(1111);
      p1.setDono("Jubileu");
      p1.abrirConta("cc");
      p1.estadoAtual();
    }
}
