package br.ufla.dcc.ppoo.padroes.perfil;

import br.ufla.dcc.ppoo.padroes.elementos_graficos.BotaoDoCruzeiro;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.CaixaTextoDoCruzeiro;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.PainelDoCruzeiro;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.RotuloDoCruzeiro;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FabricaDoPerfilDoCruzeiro extends FabricaDePerfis {

    @Override
    public JPanel criarPainel() {        
        return new PainelDoCruzeiro();
    }

    @Override
    public JLabel criarRotulo() {
        return new RotuloDoCruzeiro();
    }

    @Override
    public JButton criarBotao() {
        return new BotaoDoCruzeiro();
    }

    @Override
    public JTextField criarCaixaDeTexto() {
       return new CaixaTextoDoCruzeiro();
    }
    
}
