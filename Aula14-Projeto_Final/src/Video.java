package com.mycompany.aula14_projetofinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private boolean videoCurtido;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.videoCurtido = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    public boolean getVideoCurtido() {
        return videoCurtido;
    }

    public void setVideoCurtido(boolean videoCurtido) {
        this.videoCurtido = videoCurtido;
    }

    @Override
    public void play() {
        if(this.isReproduzindo()){
            System.out.println("O vídeo já está em reprodução!\n");
        }else{
            this.setReproduzindo(true);
            System.out.println("Vídeo em reprodução.\n");
        }
    }

    @Override
    public void pause() {
        if(!this.isReproduzindo()){
            System.out.println("O vídeo já está pausado!\n");
        }else{
            this.setReproduzindo(false);
            System.out.println("Vídeo pausado.\n");
        }
    }

    @Override
    public void like() {
        if(this.getVideoCurtido()){
            this.setVideoCurtido(false);
            this.setCurtidas(this.getCurtidas() - 1);
            System.out.println("Você deixou de curtir o vídeo.\n");
        }
        else{
            this.setVideoCurtido(true);
            this.setCurtidas(this.getCurtidas() + 1);
            System.out.println("Você curtiu o vídeo.\n");
        }
    }

    @Override
    public String toString() {
        return "Video{" + 
                "titulo=" + titulo + 
                ", avaliacao=" + avaliacao + 
                ", views=" + views + 
                ", curtidas=" + curtidas + 
                ", reproduzindo=" + reproduzindo + 
                ", videoCurtido=" + videoCurtido + 
                '}';
    }
    
    
}
