public class Item {
    private String palavra;
    private String definicao;

    public Item(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getDefinicao() {
        return definicao;
    }
}
