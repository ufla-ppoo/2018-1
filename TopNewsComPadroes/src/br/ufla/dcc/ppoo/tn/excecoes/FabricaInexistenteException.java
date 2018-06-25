package br.ufla.dcc.ppoo.tn.excecoes;

public class FabricaInexistenteException extends Exception {

    public FabricaInexistenteException() {
        super("Não foi possível carregar o tema da aplicação. Favor verificar o arquivo de configurações do sistema.");
    }
}
