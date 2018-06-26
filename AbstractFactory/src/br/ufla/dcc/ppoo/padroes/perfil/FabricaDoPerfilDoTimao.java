package br.ufla.dcc.ppoo.padroes.perfil;

import br.ufla.dcc.ppoo.padroes.elementos_graficos.BotaoDoTimao;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.CaixaTextoDoTimao;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.PainelDoTimao;
import br.ufla.dcc.ppoo.padroes.elementos_graficos.RotuloDoTimao;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FabricaDoPerfilDoTimao extends FabricaDePerfis {

    @Override
    public JPanel criarPainel() {        
        return new PainelDoTimao();
    }

    @Override
    public JLabel criarRotulo() {
        return new RotuloDoTimao();
    }

    @Override
    public JButton criarBotao() {
        return new BotaoDoTimao();
    }

    @Override
    public JTextField criarCaixaDeTexto() {
       return new CaixaTextoDoTimao();
    }
    
}
