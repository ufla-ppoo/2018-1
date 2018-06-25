package br.ufla.dcc.ppoo.tn.util;

import br.ufla.dcc.ppoo.tn.excecoes.FabricaInexistenteException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Configuracao {

    private static Configuracao instancia = null;
    private String arqConfiguracao;

    private Configuracao(String arqConfiguracao) {
        this.arqConfiguracao = arqConfiguracao;
    }

    public static Configuracao obterInstancia(String arqConfiguracao) {
        if (instancia == null) {
            instancia = new Configuracao(arqConfiguracao);
        }
        return instancia;
    }

    /*
    * Retorna uma string contendo o texto da primeira linha do arquivo ou
    * lança uma exceção do tipo FabricaInexistenteException, caso o arquivo não exista ou caso esteja vazio.
     */
    public String obterNomeFabrica() throws FabricaInexistenteException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(arqConfiguracao));
            if (br.ready()) {
                return br.readLine();
            } 
            throw new FabricaInexistenteException();
        } catch (IOException ex) {
            throw new FabricaInexistenteException();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    throw new FabricaInexistenteException();
                }
            }
        }
    }
}
