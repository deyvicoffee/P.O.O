package com.mycompany.aula12;

public class Tartaruga extends Reptil{
    @Override
    public void locomover(){
        System.out.println("Andando beeeem devagar");
    }
    
    public void dados() {
        System.out.println("Tartaruga{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corEscama=" + corEscama + "}\n");
    }
}
