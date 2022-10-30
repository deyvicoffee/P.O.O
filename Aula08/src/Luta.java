package com.mycompany.aula08;

import java.util.Random;

public class Luta {

    public Luta(){
        this.aprovada = false;
        this.desafiante = null;
        this.desafiado = null;
        this.rounds = 0;
        this.pontosDesafiado = 0;
        this.pontosDesafiante = 0;
    }
    
    /**
     * Os atributos desafiado e desafiante não são simples atributos primitivos mas sim
     * instancias da classe lutador, assim sendo podemos utilizar de todos os seus metodos
     * e atributos.
     */

    private Lutador desafiado; //tipo abstrato
    private Lutador desafiante; //tipo abstrato
    private int rounds;
    private boolean aprovada;
    private int pontosDesafiado;
    private int pontosDesafiante;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public int getPontosDesafiado() {
        return pontosDesafiado;
    }

    public void setPontosDesafiado(int pontosDesafiado) {
        this.pontosDesafiado = pontosDesafiado;
    }

    public int getPontosDesafiante() {
        return pontosDesafiante;
    }

    public void setPontosDesafiante(int pontosDesafiante) {
        this.pontosDesafiante = pontosDesafiante;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2, int r){
        if(l1 == l2){
            System.out.println("Erro ao marcar a luta! Desafiante e desafiado são a mesma pessoa.\n");
        }
        else if (!l1.getCategoria().equals(l2.getCategoria())){
            System.out.println("Erro ao marcar a luta! Os lutadores são de categorias diferentes.\n");
        }
        else if(r == 0){
            System.out.println("Erro ao marcar a luta! O número de rounds deve ser maior que 0.\n");
        }
        else {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            this.setRounds(r);
            System.out.println("Luta marcada com sucesso.\n");
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("\t---DESAFIADO---");
            this.getDesafiado().apresentar();
            
            System.out.println("\t---DESAFIANTE---");
            this.getDesafiante().apresentar();
            
            System.out.println("\t---INICIO DA LUTA---\n");
            for(int i = 0; i < this.getRounds(); i++){
               
                System.out.println("ROUND " + (i+1));

                Random rand = new Random();
                int vencedor = rand.nextInt(3);

                switch(vencedor){
                    case 0: 
                        System.out.println("Empate\n");
                    break;
                    
                    case 1:
                        System.out.println("O vencedor é o desafiado " + this.getDesafiado().getNome() + "\n");
                        this.setPontosDesafiado(this.getPontosDesafiado() + 1);
                    break;
                    
                    case 2:
                        System.out.println("O vencedor é o desafiante " + this.getDesafiante().getNome() + "\n");
                        this.getDesafiado().setDerrotas(1);
                        this.getDesafiante().setVitorias(1);
                        this.setPontosDesafiante(this.getPontosDesafiante() + 1);
                    break;
                }
            }
            
            System.out.println("\t---FIM DA LUTA---");
            if(this.getPontosDesafiado() == this.getPontosDesafiante()){
                System.out.println("A luta ficou empatada!");
                this.getDesafiado().setEmpates(this.getDesafiado().getEmpates() + 1);
                this.getDesafiante().setEmpates(this.getDesafiante().getEmpates() + 1);
            }
            else if(this.getPontosDesafiado() > this.getPontosDesafiante()){
                System.out.println("O desafiado " + this.getDesafiado().getNome() + " é o vencedor!");
                this.getDesafiado().setVitorias(this.getDesafiado().getVitorias() + 1);
                this.getDesafiante().setDerrotas(this.getDesafiante().getDerrotas() + 1);
            }
            else{
                System.out.println("O desafiante " + this.getDesafiante().getNome() + " é o vencedor!");
                this.getDesafiado().setDerrotas(this.getDesafiado().getDerrotas() + 1);
                this.getDesafiante().setVitorias(this.getDesafiante().getVitorias() + 1);                
            }
            
            System.out.println("\n---RESULTADO FINAL---");
            System.out.println("LUTADOR DESAFIADO:");
            this.getDesafiado().status();
            
            System.out.println("LUTADOR DESAFIANTE:");
            this.getDesafiante().status();
        }else{
            System.out.println("A luta não pode ocorrer pois ela não foi aprovada.\n");
        }
    }
}
