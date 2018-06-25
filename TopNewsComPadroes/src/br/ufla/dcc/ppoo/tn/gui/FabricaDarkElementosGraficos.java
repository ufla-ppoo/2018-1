package br.ufla.dcc.ppoo.tn.gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FabricaDarkElementosGraficos extends FabricaAbstrataElementosGraficos {

    @Override
    public JLabel criarRotulo() {
        JLabel lb = new JLabel();
        lb.setBackground(Color.BLACK);
        lb.setForeground(Color.WHITE);
        return lb;
    }

    @Override
    public JTextArea criarAreaTexto() {
        JTextArea ta = new JTextArea();
        ta.setBackground(Color.LIGHT_GRAY);
        ta.setForeground(Color.BLACK);
        return ta;
    }

    @Override
    public JTextField criarCampoTexto() {
        JTextField tf = new JTextField();
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setForeground(Color.BLACK);
        return tf;
    }

    @Override
    public JButton criarBotao() {
        JButton btn = new JButton();
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);          
        btn.setFocusPainted(false);
        return btn;
    }

    @Override
    public JCheckBox criarCaixaMarcacao() {
        JCheckBox chk = new JCheckBox();
        chk.setBackground(Color.BLACK);
        chk.setForeground(Color.WHITE);           
        return chk;
    }

    @Override
    public JPanel criarPainel() {
        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);
        return painel;
    }

}
