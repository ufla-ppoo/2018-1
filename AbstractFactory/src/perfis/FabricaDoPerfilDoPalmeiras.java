/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perfis;

import elementos_graficos.BotaoDoPalmeiras;
import elementos_graficos.CaixaTextoDoPalmeiras;
import elementos_graficos.PainelDoPalmeiras;
import elementos_graficos.RotuloDoPalmeiras;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paulo
 */
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
