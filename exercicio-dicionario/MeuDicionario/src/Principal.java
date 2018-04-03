
public class Principal {

    public static void main(String[] args) {
        Dicionario meuDicionario = new Dicionario();

        Item i1 = new Item("Corinthians", "Melhor time do Brasil!");
        Item i2 = new Item("Palmeiras", "Palavra não reconhecida!");

        System.out.println(meuDicionario.adicionarItem(i1));
        System.out.println(meuDicionario.adicionarItem(i2));
        System.out.println(meuDicionario.adicionarItem(i1));

        String pesquisa = "São Paulo";
        Item itemRetorno = meuDicionario.consultarItem(pesquisa);
        
        if (itemRetorno != null) {
            System.out.println(itemRetorno.getDefinicao());
        } else {
            System.out.println("Esta palavra não foi cadastrada!");
        }
        
    }
}
