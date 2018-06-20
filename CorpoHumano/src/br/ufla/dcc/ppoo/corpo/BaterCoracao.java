package br.ufla.dcc.ppoo.corpo;

public class BaterCoracao implements Runnable {

    @Override
    public void run() {
        try {
            int n = 0;
            while (true) {
                System.out.println(n + " Bateu coração");
                Thread.sleep(520);
                n++;
            }
        } catch (InterruptedException ex) {
            System.out.println("Problema ao executar thread PiscarOlhos");
        }
    }
}

