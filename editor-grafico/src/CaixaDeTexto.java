public class CaixaDeTexto implements ObjetoDesenhavel {
    private double posX;
    private double posY;
    private double altura;
    private double largura;
    private String texto;

    public CaixaDeTexto(double posX, double posY, double altura, double largura, String texto) {
        this.posX = posX;
        this.posY = posY;
        this.altura = altura;
        this.largura = largura;
        this.texto = texto;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }

    @Override
    public void exibir() {
        System.out.println(texto);
    }
    
    
    
}
