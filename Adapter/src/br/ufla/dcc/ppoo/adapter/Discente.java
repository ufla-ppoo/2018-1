package br.ufla.dcc.ppoo.adapter;

public class Discente extends Pessoa {
    private DiscenteDeOutroProjeto discente;
    public Discente(String nome, String matricula) {
        super(nome);
        this.discente = new DiscenteDeOutroProjeto(nome, matricula);
    }
    public String getMatricula() { return discente.getMatricula(); }
    @Override
    public void imprimir() {
        System.out.println(super.getNome() + " (Discente) - " + this.getMatricula());        
    }    
}
