
import java.util.ArrayList;

public class Dicionario {
    private ArrayList<Item> itens;

    public Dicionario() {
        itens = new ArrayList<Item>();
    }
    
    public boolean adicionarItem(Item item) {
        if (consultarItem(item.getPalavra()) == null) {
            itens.add(item);
            return true;
        }
        return false;
    }
    
    public Item consultarItem(String palavra) {
        for(Item item : itens) {
            if (palavra.equalsIgnoreCase(item.getPalavra())) {
                return item;
            }
        }
        return null;
    }
    
}
