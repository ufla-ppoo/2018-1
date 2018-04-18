
import java.util.ArrayList;

public class Painel {

    private ArrayList<ObjetoDesenhavel> objsDesenhaveis;

    public Painel() {
        objsDesenhaveis = new ArrayList<ObjetoDesenhavel>();
    }

    public void adicionarElemento(ObjetoDesenhavel fg) {
        objsDesenhaveis.add(fg);
    }

    public void exibir() {
        for (ObjetoDesenhavel fg : objsDesenhaveis) {
            fg.exibir();
        }
    }
    
    public double calcArea() {
        double soma = 0.0;
        for (ObjetoDesenhavel fg : objsDesenhaveis) {
            soma = soma + fg.getArea();
        }
        return soma;
    }
}
