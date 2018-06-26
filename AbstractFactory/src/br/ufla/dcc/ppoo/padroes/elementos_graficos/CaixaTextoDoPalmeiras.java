package br.ufla.dcc.ppoo.padroes.elementos_graficos;

import java.awt.Font;
import javax.swing.JTextField;

public class CaixaTextoDoPalmeiras extends JTextField {

    @Override
    public Font getFont() {
        return new Font(Font.SANS_SERIF, Font.ITALIC, 14);
    }

}
