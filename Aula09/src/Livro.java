package com.mycompany.aula09;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;  
    private Pessoa autor; //tipo abstrato, autor é uma instancia da classe pessoa
    private int totPaginas;
    private Pessoa leitor; //relacionamento de agregação
    private int pagAtual;
    private boolean aberto;

    //Costrutor
    public Livro(String titulo, Pessoa autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    //Métodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
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
    
    public void detalhes(){
        System.out.println("\t --- DESCRIÇÃO DA OBRA ---");
        System.out.println("Autor: " + this.getAutor().getNome());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Estado: " + (this.isAberto() ? "aberto" : "fechado"));
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }

    //Metodos da interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto()){
            if(p <= this.getTotPaginas()){
                this.setPagAtual(this.getPagAtual() + p);
                System.out.println("Folheando...");
                try {
                    TimeUnit.SECONDS.sleep(p); //0.95s
                } catch (InterruptedException ex) {
                    Logger.getLogger(Livro.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Páginas folheadas! Agora voce está na página " + this.getPagAtual() + "\n");
            }else{
                System.out.println("Você não pode folhear "+p+" páginas pois o livro possui "+this.getTotPaginas()+" páginas.\n");
            }
        }else{
            System.out.println("Abra o livro antes de folhear.\n");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
        System.out.println("Pagina atual: " + this.getPagAtual());
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println("Pagina atual: " + this.getPagAtual());
    }
}
