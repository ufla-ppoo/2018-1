public class Casa extends Imovel {
    private double areaExterna;

    public Casa(double areaExterna, double areaTotal, int numeroQuartos, Inquilino inquilino) {
        super(areaTotal, numeroQuartos, inquilino);
        this.areaExterna = areaExterna;
    }
    
    @Override
    public double calcAluguel() {
        return (20 * getAreaTotal()) * 1.1;
    }
    
    @Override
    public String getInformacoes() {
        return "casa (" + getAreaTotal() + "m2 - área externa: " +
                areaExterna + "m2)";
    }

    public double getAreaExterna() {
        return areaExterna;
    }
    
}
