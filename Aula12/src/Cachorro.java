package com.mycompany.aula12;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    @Override
    public void dados() {
        System.out.println("Cachorro{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corPelo=" + corPelo + "}\n");
    }
}
