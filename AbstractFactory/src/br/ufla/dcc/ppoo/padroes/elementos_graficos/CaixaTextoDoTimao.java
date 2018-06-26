package br.ufla.dcc.ppoo.padroes.elementos_graficos;

import java.awt.Font;
import javax.swing.JTextField;

public class CaixaTextoDoTimao extends JTextField {

    @Override
    public Font getFont() {
        return new Font(Font.MONOSPACED, Font.BOLD, 12);
    }

}
