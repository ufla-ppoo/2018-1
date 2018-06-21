package br.ufla.dcc.ppoo.tn.excecoes;

public class PalavraChaveInvalidaException extends Exception {

    public PalavraChaveInvalidaException() {
        super("Informe uma palavra-chave com pelo menos 3 (três) caracteres!");
    }
    
}
