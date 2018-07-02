package br.ufla.dcc.ppoo.adapter;

public class Docente extends Pessoa {
    private String SIAPE;
    
    public Docente(String nome, String SIAPE) { 
        super(nome);
        this.SIAPE = SIAPE;
    }
    public String getSIAPE() { return this.SIAPE; }
    
    @Override
    public void imprimir() {
        System.out.println(super.getNome() + 
                " (Docente) - " + this.getSIAPE());
    }
    
}
