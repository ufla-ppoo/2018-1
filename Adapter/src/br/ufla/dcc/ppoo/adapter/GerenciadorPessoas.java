package br.ufla.dcc.ppoo.adapter;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    private List<Pessoa> pessoas;
    public GerenciadorPessoas() {
        pessoas = new ArrayList<>();
    }
    public void cadastrarPessoa(Pessoa p) { this.pessoas.add(p); }
    public void gerarRelatorio() {
        for(Pessoa p: pessoas) {
            p.imprimir();
        }
    }
}
