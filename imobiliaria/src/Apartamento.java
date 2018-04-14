public class Apartamento extends Imovel {
    private int numeroAndar;
    private double taxaCondominio;

    public Apartamento(int numeroAndar, double taxaCondominio, double areaTotal, int numeroQuartos, Inquilino inquilino) {
        super(areaTotal, numeroQuartos, inquilino);
        this.numeroAndar = numeroAndar;
        this.taxaCondominio = taxaCondominio;
    }
    
    @Override
    public double calcAluguel() {
        return (20 * getAreaTotal() + taxaCondominio) * 1.15;
    }
    
    @Override
    public String getInformacoes() {
        return "apartamento (" + getAreaTotal() + "m2, tx cond: R$" +
                taxaCondominio + ")";
    }

    public double getTaxaCondominio() {
        return taxaCondominio;
    }
}
