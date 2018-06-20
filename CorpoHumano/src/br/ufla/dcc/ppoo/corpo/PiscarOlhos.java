package br.ufla.dcc.ppoo.corpo;

public class PiscarOlhos implements Runnable {

    @Override
    public void run() {
        try {
            int n = 0;
            while (true) {
                System.out.println(n + " Piscou os olhos");
                Thread.sleep(3000);
                n++;
            }
        } catch(InterruptedException ex) {
            System.out.println("Problema ao executar thread PiscarOlhos");
        }
    }

}
