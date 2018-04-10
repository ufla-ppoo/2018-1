
public class Retangulo {

    private double altura;
    private double largura;
    private double posX;
    private double posY;
    private String cor;

    public Retangulo(double altura, double largura, double posX, double posY, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.posX = posX;
        this.posY = posY;
        this.cor = cor;
    }

    public double obterPosX() {
        return posX;
    }

    public double obterPosY() {
        return posY;
    }
}
