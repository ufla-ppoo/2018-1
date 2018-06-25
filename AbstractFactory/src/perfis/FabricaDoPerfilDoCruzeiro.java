/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perfis;

import elementos_graficos.BotaoDoCruzeiro;
import elementos_graficos.CaixaTextoDoCruzeiro;
import elementos_graficos.PainelDoCruzeiro;
import elementos_graficos.RotuloDoCruzeiro;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paulo
 */
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
