
import java.util.ArrayList;

public class Locacao {
    private String dataLocacao;
    private String dataExpiracao;
    private Cliente cliente;
    private ArrayList<Video> videos;

    public Locacao(String dataLocacao, String dataExpiracao, Cliente cliente) {
        this.dataLocacao = dataLocacao;
        this.dataExpiracao = dataExpiracao;
        this.cliente = cliente;
        videos = new ArrayList<Video>();
    }
    
    public void adicionarVideo(Video video) {
        if (videos.size() < 5) {
            videos.add(video);
        }
    }
    
    public String obterRecibo() {
        String recibo = "";
        
        // Cliente: Elon Musk (28/06/1971)
        recibo += "Cliente: " + cliente.getNome() + " (" + 
                cliente.getDataNascimento() + ")\n";
        
        // Locação: 11/09/2017 à 13/09/2017
        recibo += "Locação: " + dataLocacao + " à " + dataExpiracao + "\n";
        
        // Vídeos:
        recibo += "Vídeos:\n";
        
        double totalDaLocacao  = 0.0;
        for(Video v: videos) {
            recibo += v.obterInfo();
            totalDaLocacao += v.obterValorTotal();
        }
        
        // Valor total da locação: R$ 12,90
        recibo += "Valor total da locação: R$ " + totalDaLocacao + "\n";
        
        return recibo;
    }
}
