package br.ufla.dcc.ppoo.padroes.elementos_graficos;

import java.awt.Color;
import javax.swing.JButton;

public class BotaoDoTimao extends JButton {

    @Override
    public Color getBackground() {
        return Color.GRAY;
    }

    @Override
    public Color getForeground() {
        return Color.BLACK;
    }  
    
    
}
