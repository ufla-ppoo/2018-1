
public class Principal {

    public static void main(String[] args) {
        Painel meuPainel = new Painel();
        meuPainel.adicionarElemento(
                new Retangulo(2, 3, 5.2, 3.8, "Azul"));
        meuPainel.adicionarElemento(
                new Retangulo(2, 1, 5.2, 3.8, "Azul"));
        meuPainel.adicionarElemento(
                new Circulo(2, 0, 0, "Verde"));
        meuPainel.exibir();
        System.out.println("Área total: " + meuPainel.calcArea());
    }
}
