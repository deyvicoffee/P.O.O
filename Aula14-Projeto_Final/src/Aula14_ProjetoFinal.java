package com.mycompany.aula14_projetofinal;

public class Aula14_ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("Aula 1 de P.O.O");
        v[1] = new Video("Aula 5 de HTML5 e CSS3");
        v[2] = new Video("Aula 8 de SEO");
        
        System.out.println(v[1].toString());
        
        g[0] = new Gafanhoto("jubiscreison", 25, "M", "jubinho");
        g[1] = new Gafanhoto("jubileia", 32, "F", "juleia");
        
        System.out.println("\n"+g[1].toString());
    }
}
