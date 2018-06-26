package br.ufla.dcc.ppoo.padroes.perfil;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class FabricaDePerfis {
       public abstract JPanel criarPainel();
       public abstract JLabel criarRotulo();
       public abstract JButton criarBotao();
       public abstract JTextField criarCaixaDeTexto();
}
