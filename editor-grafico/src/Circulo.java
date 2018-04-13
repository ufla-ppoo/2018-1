
public class Circulo extends FormaGeometrica {

    private final double PI = 3.1415;
    private double raio;

    public Circulo(double raio, double posX, double posY,
            String cor) {
        super(posX, posY, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    @Override
    public double getArea() {
        return PI * raio * raio;
    }

    @Override
    public void exibir() {
        System.out.printf("Círculo (r = %.2f)", 
                raio);
        super.exibir();
    }

    
    
}
