package br.ufla.dcc.ppoo.adapter;

public class DiscenteDeOutroProjeto {
    private String nome;
    private String matricula;
    public DiscenteDeOutroProjeto(String nome, String matricula) {
        this.nome = nome; this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
}
