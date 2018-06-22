package br.ufla.dcc.ppoo.tn.gui;

import br.ufla.dcc.ppoo.tn.api.TopNewsAPI;
import br.ufla.dcc.ppoo.tn.excecoes.PalavraChaveInvalidaException;
import br.ufla.dcc.ppoo.tn.noticia.Noticia;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {

    private JLabel lbPalavraChave;
    private JLabel lbUltimaAtualizacao;
    private JTextField tfPalavraChave;
    private JButton btBuscar;
    private JCheckBox ckbAuto;
    private JTextArea taNoticias;
    private JScrollPane scrollNoticias;

    // Componentes referentes ao layout da tela
    private GridBagConstraints gbc;
    private GridBagLayout gbl;

    private TopNewsAPI tnAPI;
    private final int QTDE_NOTICIAS = 5;
    private final String STR_QTDE_NOTICIAS = "cinco";

    public TelaPrincipal() {
        super("TopNews");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        construirTela();
        pack();

        tnAPI = new TopNewsAPI(QTDE_NOTICIAS);
    }

    private String obterUltimaAtualizacao() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date dtAtual = Calendar.getInstance().getTime();
        return String.format("Última atualização: %s", sdf.format(dtAtual));
    }

    private void construirTela() {
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(gbl);

        lbPalavraChave = new JLabel("Quais são as " + STR_QTDE_NOTICIAS + 
                " notícias mais recentes sobre...");
        lbUltimaAtualizacao = new JLabel(obterUltimaAtualizacao());
        tfPalavraChave = new JTextField(35);
        btBuscar = new JButton("Buscar");
        btBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                atualizarNoticias();
            }
        });
        ckbAuto = new JCheckBox("automático");
        taNoticias = new JTextArea(30, 30);
        taNoticias.setLineWrap(true);
        taNoticias.setEditable(false);
        scrollNoticias = new JScrollPane(taNoticias);

        adicionarComponente(lbPalavraChave, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                0, 0, 1, 1);
        adicionarComponente(tfPalavraChave, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                1, 0, 1, 1);
        adicionarComponente(btBuscar, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                0, 1, 1, 1);
        adicionarComponente(ckbAuto, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                1, 1, 1, 1);
        adicionarComponente(scrollNoticias, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                2, 0, 2, 1);
        adicionarComponente(lbUltimaAtualizacao, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                3, 0, 2, 1);        

    }

    private String obterPalavraChave() throws PalavraChaveInvalidaException {
        if (tfPalavraChave.getText().trim().length() < 3) {
            throw new PalavraChaveInvalidaException();
        }
        return tfPalavraChave.getText();
    }

    private void atualizarNoticias() {
        try {
            String palavraChave = obterPalavraChave();
            List<Noticia> lstNoticias = tnAPI.obterNoticiasSobre(palavraChave);
            taNoticias.setText("");
            if (lstNoticias.isEmpty()) {
                taNoticias.setText("Sem notícias, por enquanto...");
            } else {
                int i = 1;
                for (Noticia n : lstNoticias) {
                    String strNoticia = String.format("%dº %s: %s\n%s\n\n",
                            i, n.getAutor(), n.getTitulo(), n.getUrl());
                    taNoticias.append(strNoticia);
                    i++;
                }
            }
            lbUltimaAtualizacao.setText(obterUltimaAtualizacao());

        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar notícias!",
                    "Ops...", JOptionPane.ERROR_MESSAGE);
        } catch (PalavraChaveInvalidaException pex) {
            JOptionPane.showMessageDialog(this, pex.getMessage(),
                    "Ops...", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void adicionarComponente(Component comp, int anchor, int fill, int linha, int coluna, int larg, int alt) {
        gbc.anchor = anchor; // posicionamento do componente na tela (esquerda, direita, centralizado, etc)
        gbc.fill = fill; // define se o tamanho do componente será expandido ou não
        gbc.gridy = linha; // linha do grid onde o componente será inserido
        gbc.gridx = coluna; // coluna do grid onde o componente será inserido
        gbc.gridwidth = larg; // quantidade de colunas do grid que o componente irá ocupar
        gbc.gridheight = alt; // quantidade de linhas do grid que o componente irá ocupar
        gbc.insets = new Insets(3, 3, 3, 3); // espaçamento (em pixels) entre os componentes da tela
        gbl.setConstraints(comp, gbc); // adiciona o componente "comp" ao layout com as restrições previamente especificadas
        add(comp); // efetivamente insere o componente na tela
    }

    public static void main(String[] args) {
        new TelaPrincipal().setVisible(true);        
    }
}
