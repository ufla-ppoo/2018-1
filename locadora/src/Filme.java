public class Filme extends Video {
    private int duracaoEmMinutos;

    public Filme(int duracaoEmMinutos, String titulo, int anoLancamento, double preco) {
        super(titulo, anoLancamento, preco);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    
    @Override
    public String obterInfo() {
        // Piratas do Vale do Silício (120 min) (R$ 3,90)
        return "\t" + getTitulo() + " (" + duracaoEmMinutos + " min) (R$ " + 
                getPreco() + ")\n";
    }
    
    @Override
    public double obterValorTotal() {
        return getPreco();
    }
}
