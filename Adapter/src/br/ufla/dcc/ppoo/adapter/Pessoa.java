package br.ufla.dcc.ppoo.adapter;

public abstract class Pessoa {
    private String nome;
    
    public Pessoa(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public abstract void imprimir();    
}
