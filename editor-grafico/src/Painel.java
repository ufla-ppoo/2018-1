import java.util.ArrayList;

public class Painel {

    private ArrayList<Retangulo> retangulos;

    public Painel() {
        this.retangulos = new ArrayList<Retangulo>();
    }

    public void adicionarElemento(Retangulo r) {
        retangulos.add(r);
    }

    public void exibir() {
        for (Retangulo r : retangulos) {
            System.out.printf("[%.2f; %.2f]\n",
                    r.obterPosX(), r.obterPosY());
        }
    }
}
