package br.ufla.dcc.ppoo.tn.api;

import br.ufla.dcc.ppoo.tn.noticia.Noticia;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class TopNewsAPI {

    private final String API_KEY = "INFORME_SUA_APIKEY_AQUI";
    private static final String URL_BASE = "https://newsapi.org/v2/top-headlines?apiKey=";
    private int qtdeNoticias;

    public TopNewsAPI(int qtdeNoticias) {
        this.qtdeNoticias = qtdeNoticias;
    }

    public List<Noticia> obterNoticiasSobre(String palavraChave) throws IOException {
        // Os espaços em branco devem ser substituidos por palavras chave
        palavraChave = palavraChave.replaceAll(" ", "+");
        URL urlConsulta = new URL(URL_BASE + API_KEY + "&sortby=popularity&q=" + palavraChave);
        JsonReader ler = Json.createReader(urlConsulta.openStream());
        JsonArray dados = ler.readObject().getJsonArray("articles");

        List<Noticia> lstNoticias = new ArrayList<Noticia>();
        
        int i = 0;
        while (i < dados.size() && i < qtdeNoticias) {
            JsonObject obj = dados.getJsonObject(i);
            Noticia n = new Noticia(
                    obj.getString("title"),
                    obj.getJsonObject("source").getString("name"),
                    obj.getString("url")
            );
            lstNoticias.add(n);
            i++;
        }
        return lstNoticias;
    }
}
