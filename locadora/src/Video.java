public abstract class Video {
    private String titulo;
    private int anoLancamento;
    private double preco;

    public Video(String titulo, int anoLancamento, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPreco() {
        return preco;
    }
    
    public abstract String obterInfo();
    public abstract double obterValorTotal();
    
}
