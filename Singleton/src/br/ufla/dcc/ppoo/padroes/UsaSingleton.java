package br.ufla.dcc.ppoo.padroes;

public class UsaSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        
        // Saída = "true", provando que "s1" e "s2" apontam para o mesmo objeto (instância).
        System.out.println(s1 == s2);
    }
}
