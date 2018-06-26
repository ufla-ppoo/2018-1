package br.ufla.dcc.ppoo.padroes.elementos_graficos;

import java.awt.Color;
import javax.swing.JButton;

public class BotaoDoCruzeiro extends JButton {

    @Override
    public Color getBackground() {
        return Color.BLUE;
    }

    @Override
    public Color getForeground() {
        return Color.WHITE;
    }  
    
    
}
