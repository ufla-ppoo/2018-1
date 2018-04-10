
public class Principal {

    public static void main(String[] args) {
        Painel meuPainel = new Painel();
        meuPainel.adicionarElemento(
                new Retangulo(2, 3, 5.2, 3.8, "Azul"));
        meuPainel.exibir();
    }
}
