
public class FormaGeometrica {

    private double posX;
    private double posY;
    private String cor;
    
    public FormaGeometrica(double posX, double posY, String cor) {
        this.posX = posX;
        this.posY = posY;
        this.cor = cor;
    }
    
    public double getArea() {
        return 0.0;
    }
    
    public void exibir() {
        System.out.printf(" -> [%.2f; %.2f]\n",
                posX, posY);
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
