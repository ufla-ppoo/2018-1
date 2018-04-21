public class Principal {
    public static void main(String[] args) {
        Cliente c = new Cliente("Elon Musk", "28/06/1971");
        Locacao loc = new Locacao("11/09/2017", "13/09/2017", c);
        loc.adicionarVideo(new Filme(120, "Piratas do Vale do Silício", 1995, 3.9));
        loc.adicionarVideo(new Serie(10, "The Big Bang Theory - Primeira Temporada", 2006, 0.9));
        loc.adicionarVideo(new Serie(12, "Game of Thrones - Primeira Temporada", 2015, 4.95));
        System.out.println(loc.obterRecibo());
    }
}
