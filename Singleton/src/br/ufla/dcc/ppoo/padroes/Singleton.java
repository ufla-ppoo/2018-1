package br.ufla.dcc.ppoo.padroes;

public class Singleton {
    private static Singleton instancia = null;
    private Singleton() {
        
    }
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
}
