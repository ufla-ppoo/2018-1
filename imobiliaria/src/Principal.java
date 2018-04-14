
import java.util.ArrayList;

public class Principal {

    public void imprimirBoleto(ArrayList<Imovel> imoveis) {
        for (Imovel i : imoveis) {
            System.out.printf("Inquilino: %s (CPF: %s)\n",
                    i.getInquilino().getNome(), i.getInquilino().getCPF());
            System.out.printf("Tipo de imóvel: %s\n",
                    i.getInformacoes());
            System.out.printf("Valor a pagar: R$ %.2f\n",
                    i.calcAluguel());
            
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Inquilino i1 = new Inquilino("Paulo", "999");
        Inquilino i2 = new Inquilino("José", "996");

        Casa c1 = new Casa(20, 100, 2, i1);
        Apartamento a1 = new Apartamento(1, 100, 60, 2, i2);
        Apartamento a2 = new Apartamento(2, 150, 100, 3, i1);
        
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        imoveis.add(c1);
        imoveis.add(a1);
        imoveis.add(a2);
        
        Principal p = new Principal();
        p.imprimirBoleto(imoveis);
    }
}
