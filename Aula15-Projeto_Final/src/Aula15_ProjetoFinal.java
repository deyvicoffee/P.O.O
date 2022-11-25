package com.mycompany.aula15_projetofinal;

import java.beans.Visibility;

public class Aula15_ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vis[] = new Visualizacao[2];
        
        v[0] = new Video("Aula 1 de P.O.O");
        v[1] = new Video("Aula 5 de HTML5 e CSS3");
        v[2] = new Video("Aula 8 de SEO");
        
        g[0] = new Gafanhoto("Jubiscreison", 25, "M", "jubinho");
        g[1] = new Gafanhoto("Jubileia", 32, "F", "juleia");
        
        vis[0] = new Visualizacao(g[0], v[0]); //Jubiscreison assiste POO
        vis[0].avaliar();
        
        vis[1] = new Visualizacao(g[0], v[1]); //Jubiscreison assiste HTML5 e CSS3
        vis[1].avaliar(40.0f);
        
        System.out.println("\n"+vis[0].toString());
        System.out.println("\n"+vis[1].toString());
    }
}
