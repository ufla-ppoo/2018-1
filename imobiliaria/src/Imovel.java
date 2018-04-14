public class Imovel {
    private double areaTotal;
    private int numeroQuartos;
    private Inquilino inquilino;

    public Imovel(double areaTotal, int numeroQuartos, Inquilino inquilino) {
        this.areaTotal = areaTotal;
        this.numeroQuartos = numeroQuartos;
        this.inquilino = inquilino;
    }
    
    public double calcAluguel() {
        return 0.0;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
    
    public String getInformacoes() {
        return "";
    }

    public Inquilino getInquilino() {
        return inquilino;
    }
}
