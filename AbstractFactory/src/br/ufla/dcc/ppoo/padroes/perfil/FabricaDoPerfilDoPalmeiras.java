package br.ufla.dcc.ppoo.padroes.perfil;

import br.ufla.dcc.ppoo.padroes.elementos_graficos.BotaoDoPalmeiras;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.CaixaTextoDoPalmeiras;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.PainelDoPalmeiras;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.RotuloDoPalmeiras;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FabricaDoPerfilDoPalmeiras extends FabricaDePerfis {

    @Override
    public JPanel criarPainel() {        
        return new PainelDoPalmeiras();
    }

    @Override
    public JLabel criarRotulo() {
        return new RotuloDoPalmeiras();
    }

    @Override
    public JButton criarBotao() {
        return new BotaoDoPalmeiras();
    }

    @Override
    public JTextField criarCaixaDeTexto() {
       return new CaixaTextoDoPalmeiras();
    }
    
}
