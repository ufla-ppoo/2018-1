
import java.util.ArrayList;

public class Painel {

    private ArrayList<FormaGeometrica> fGeometricas;

    public Painel() {
        fGeometricas = new ArrayList<FormaGeometrica>();
    }

    public void adicionarElemento(FormaGeometrica fg) {
        fGeometricas.add(fg);
    }

    public void exibir() {
        for (FormaGeometrica fg : fGeometricas) {
            fg.exibir();
        }
    }
    
    public double calcArea() {
        double soma = 0.0;
        for (FormaGeometrica fg : fGeometricas) {
            soma = soma + fg.getArea();
        }
        return soma;
    }
}
