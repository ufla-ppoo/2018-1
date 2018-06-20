package br.ufla.dcc.ppoo.corpo;

public class Respirar implements Runnable {

    @Override
    public void run() {
        try {
            int n = 0;
            while (true) {
                System.out.println(n + " Respirou");
                Thread.sleep(5000);
                n++;
            }
        } catch (InterruptedException ex) {
            System.out.println("Problema ao executar thread PiscarOlhos");
        }
    }
}
