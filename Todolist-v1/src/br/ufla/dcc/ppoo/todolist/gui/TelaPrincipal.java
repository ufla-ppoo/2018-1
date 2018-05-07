package br.ufla.dcc.ppoo.todolist.gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends JFrame {

    // Componentes referentes ao layout da tela
    private GridBagConstraints gbc;
    private GridBagLayout gbl;

    // Rótulos
    private JLabel lbDescricao;
    private JLabel lbDeadline;

    // Caixas de texto
    private JTextField tfDescricao;
    private JTextField tfDeadline;

    // Componentes necessários para uso da tabela de dados
    // Para saber mais sobre como usar JTable, acesse: https://www.devmedia.com.br/jtable-utilizando-o-componente-em-interfaces-graficas-swing/28857
    private JTable tbTarefas;
    private DefaultTableModel mdDados;
    private JScrollPane painelTarefas;

    // Botões
    private JButton btCriarNovo;
    private JButton btSalvar;
    private JButton btRemover;
    private JPanel painelBotoes; // container para os botões da tela

    public TelaPrincipal() {
        // Define o título da tela
        super("Lista de Tarefas");
        
        // Define que fechar a janela, a execução aplicação será encerrada
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Evita que a tela possa ser redimensionada pelo usuário
        setResizable(false);
        
        // Invoca o método que efetivamente constrói a tela
        construirTela();
        
        // Redimensiona automaticamente a tela, com base nos componentes existentes na mesma
        pack();
    }

    private void construirTela() {
        // Instancia os objetos de layout da tela
        gbc = new GridBagConstraints();
        gbl = new GridBagLayout();
        
        // Configura o layout da tela
        setLayout(gbl);

        // Instancia os objetos referentes aos componentes da tela
        lbDescricao = new JLabel("Tarefa");
        lbDeadline = new JLabel("Deadline");
        
        tfDescricao = new JTextField(29); // 15 refere-se ao tamanho da caixa de texto 
        tfDeadline = new JTextField(7); // 15 refere-se ao tamanho da caixa de texto
        
        btCriarNovo = new JButton("Nova tarefa");
        btCriarNovo.setEnabled(false); // define que o botão não está habilitado (não pode ser clicado)
        btSalvar = new JButton("Salvar");        
        btRemover = new JButton("Remover");
        btRemover.setEnabled(false); // define que o botão não está habilitado (não pode ser clicado)
        
        // Instancia o painel (container) de botões e adiciona os botões a ele
        painelBotoes = new JPanel();
        painelBotoes.add(btSalvar);
        painelBotoes.add(btCriarNovo);
        painelBotoes.add(btRemover);

        // Constrói a tabela de dados 
        mdDados = new DefaultTableModel(); // Toda tabela possui um modelo de dados, que é onde ficam as informações exibidas pela tabela
        tbTarefas = new JTable(mdDados);

        // Adicionando colunas ao modelo de dados. 
        mdDados.addColumn("Tarefa");
        mdDados.addColumn("Deadline");
        
        // Adiciona uma linha de dados "fake" ao modelo de dados
        mdDados.addRow(new Object[]{"Pagar aluguel", "05/05/2018"});
        
        // Configura o tamanho das colunas da tabela
        tbTarefas.getColumnModel().getColumn(0).setMaxWidth(400);
        tbTarefas.getColumnModel().getColumn(1).setMaxWidth(100);
        
        // Uma tabela precisam estar inserida em um componente JScrollPane, para que barras de rolagem sejam adicionadas a ela
        painelTarefas = new JScrollPane(tbTarefas);

        // Adicionando os componentes recém-criados à tela
        adicionarComponente(lbDescricao, GridBagConstraints.EAST, GridBagConstraints.BOTH, 0, 0, 1, 1);
        adicionarComponente(lbDeadline, GridBagConstraints.EAST, GridBagConstraints.BOTH, 0, 1, 1, 1);
        adicionarComponente(tfDescricao, GridBagConstraints.EAST, GridBagConstraints.BOTH, 1, 0, 1, 1);
        adicionarComponente(tfDeadline, GridBagConstraints.EAST, GridBagConstraints.BOTH, 1, 1, 1, 1);
        adicionarComponente(painelTarefas, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 2, 0, 2, 1);
        adicionarComponente(painelBotoes, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 3, 0, 2, 1);

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
        // Instancia um objeto da classe principal, que é uma janela, e torna a janela visível para o usuário
        new TelaPrincipal().setVisible(true);
    }

}
