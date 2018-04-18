public class Imagem implements ObjetoDesenhavel {
    private double posX;
    private double posY;
    private double altura;
    private double largura;
    private String caminhoArquivo;

    public Imagem(double posX, double posY, double altura, double largura, String caminhoArquivo) {
        this.posX = posX;
        this.posY = posY;
        this.altura = altura;
        this.largura = largura;
        this.caminhoArquivo = caminhoArquivo;
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

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }

    @Override
    public void exibir() {
        System.out.printf("Imagem (%s)\n",
                caminhoArquivo);
    }
    
       
    
}
