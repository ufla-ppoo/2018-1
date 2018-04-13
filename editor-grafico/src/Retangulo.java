
public class Retangulo extends FormaGeometrica {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura, double posX,
            double posY, String cor) {
        super(posX, posY, cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void exibir() {
        System.out.printf("Retângulo (%.2f x %.2f)", 
                altura, largura);
        super.exibir();
    }
    
    @Override
    public double getArea() {
        return altura * largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

}
