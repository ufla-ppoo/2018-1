package br.ufla.dcc.ppoo.tn.noticia;

public class Noticia {
    private String titulo;
    private String autor;
    private String url;

    public Noticia(String titulo, String autor, String url) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getUrl() {
        return url;
    }
}
