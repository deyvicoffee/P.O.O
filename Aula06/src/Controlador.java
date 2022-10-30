package com.mycompany.aula06;

public interface Controlador {
    //Lista de métodos abstratos
    public abstract void ligar(); //não há escopo pois a implementação não é feita aqui
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
