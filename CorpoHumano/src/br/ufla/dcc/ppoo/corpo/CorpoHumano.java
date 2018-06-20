package br.ufla.dcc.ppoo.corpo;

import java.util.ArrayList;
import java.util.List;

public class CorpoHumano {

    private List<Thread> atividades;
    
    public CorpoHumano() {
        atividades = new ArrayList<Thread>();
        atividades.add(new Thread(new PiscarOlhos()));        
        atividades.add(new Thread(new Respirar()));        
        atividades.add(new Thread(new BaterCoracao()));        
    }
    
    public void nascer() {
        for (Thread t : atividades) {
            t.start();
        }
    }
    
    public static void main(String[] args) {
        CorpoHumano corpo = new CorpoHumano();
        corpo.nascer();
    }
}
