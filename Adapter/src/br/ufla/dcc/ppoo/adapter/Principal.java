package br.ufla.dcc.ppoo.adapter;

public class Principal {

    public static void main(String[] args) {
        GerenciadorPessoas ger = new GerenciadorPessoas();
        Docente dc1 = new Docente("Paulo", "999");
        Docente dc2 = new Docente("José", "998");
        Tecnico tc1 = new Tecnico("Pedro", "997");
        ger.cadastrarPessoa(dc1); 
        ger.cadastrarPessoa(dc2);
        ger.cadastrarPessoa(tc1); 
        ger.gerarRelatorio();
    }
}
