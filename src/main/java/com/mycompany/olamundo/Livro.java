package com.mycompany.olamundo;

public class Livro  implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + 
                ", autor=" + autor + ", totPaginas=" + 
                totPaginas + ", aberto=" + 
                aberto + ", leitor=" + leitor + '}';
    }

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
    }
    
    

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getAgAtual() {
        return pagAtual;
    }

    public void setAgAtual(int agAtual) {
        this.pagAtual = agAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
    this.aberto = true;
  
    }

    @Override
    public void fechar() {
    this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
      this.pagAtual = pag;  
    }

    @Override
    public void avancarPag() {
        this.pagAtual = +1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual = -1;
    }   
}
