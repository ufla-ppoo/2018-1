package br.ufla.dcc.ppoo.temcafe.compadrao;

import java.io.IOException;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sirene implements Observador {

    private final int VOL_MINIMO = 500;

    private void tocarSirene() {
        try {
            AudioStream as = new AudioStream(getClass().getResourceAsStream("sirene.wav"));
            AudioPlayer.player.start(as);
        } catch (IOException ex) {
            System.out.println("Erro ao abrir arquivo de áudio!");
        }
    }

    @Override
    public void atualizar(Observado obs) {
        if (obs instanceof TelaCopa) {
            TelaCopa copa = (TelaCopa) obs;
            if (copa.obterVolume() < VOL_MINIMO) {
                tocarSirene();
            }
        }
    }

}
