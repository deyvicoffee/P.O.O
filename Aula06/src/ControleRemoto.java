/**
 * Como fazer para descobrir se um código está encapsulado ou não?
 * Para se ter acesso a algum atributo ou método que esteja encapsulado
 * utiliza-se o conceito de get e set. Por definição, com SET é feita uma
 * atribuição a algum atributo, ou seja, define, diz o valor que algum atributo deve ter.
 * E com GET é possível recuperar esse valor.
 */
package com.mycompany.aula06;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //Métodos obstratos
    
    //Como fizemos a implementação de uma interface somos obrigados a programar todo
    //o funcionamento da mesma.
    
    //@Override:
    //Significa sobrescrever, ou seja, já tinhamos um método definido, que era abstrato e 
    //nesse momento estamos sobrescrevenndo ele desconsiderando aquela programação que antes não tinha 
    //sido feita e que agora estamos construindo.
    
    //O próximo passo após implementar os métodos da interface é programá-los, defindo o que cada um deles 
    //irá fazer.
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n---- MENU ----");
        System.out.println("Controle " + (this.getLigado() ? "ligado" : "desligado"));

        System.out.print("VOLUME \t");

        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print(" | ");
        }
        System.out.print("\t" + this.getVolume() + "\n");
        
        System.out.println((this.getTocando() ? "Está" : "Não está") + " tocando\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}
