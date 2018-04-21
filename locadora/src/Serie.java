public class Serie extends Video {
    private int qtdeEpisodios;

    public Serie(int qtdeEpisodios, String titulo, int anoLancamento, double preco) {
        super(titulo, anoLancamento, preco);
        this.qtdeEpisodios = qtdeEpisodios;
    }

    public int getQtdeEpisodios() {
        return qtdeEpisodios;
    }
    
    @Override
    public String obterInfo() {
        // The Big Bang Theory - Primeira Temporada (10 ep.) (10 x R$ 0,90 = R$ 9,00)
        return "\t" + getTitulo() + " (" + qtdeEpisodios + " ep.) (" + 
                qtdeEpisodios + " x R$ " + getPreco() + " = R$ " +
                obterValorTotal() + ")\n";
    }
    
    @Override
    public double obterValorTotal() {
        return getPreco() * qtdeEpisodios;
    }
}
