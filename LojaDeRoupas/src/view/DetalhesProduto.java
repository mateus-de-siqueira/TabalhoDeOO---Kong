package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Data_control;
import model.Dados;

public class DetalhesProduto implements ActionListener {
    // [DEFININDO VARI�VEIS]

	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    
    // JANELA
    private static JFrame janela = new JFrame("Cliente");
    private static JLabel titulo = new JLabel("Detalhes do Produto");
    private static JLabel subtitulo1 = new JLabel("Infoma��es do Produto");

    // INFORMA��ES PESSOAIS

    // Input nome
    private static JLabel labelNome = new JLabel("Nome do Produto:");
    private static JTextField fieldNome = new JTextField();
    
    
    // Input tamanho
    private static JLabel labelTamanho = new JLabel("Tamanho");
    private static JTextField fieldTamanho = new JTextField();

    // Input cor
    private static JLabel labelCor = new JLabel("Cor:");
    private static JTextField fieldCor = new JTextField();

    // Input descri��o
    private static JLabel labelDesc = new JLabel("Descri��o:");
    private static JTextField fieldDesc = new JTextField();

    // Input categoria
    private static JLabel labelCategoria = new JLabel("Categoria");
    private static JTextField fieldCategoria = new JTextField();

    // Input composi��o
    private static JLabel labelComp = new JLabel("Composi��o");
    private static JTextField fieldComp = new JTextField();

    // Tipo
    private static JLabel labelTipo = new JLabel("Tipo:");
    private static JTextField fieldTipo = new JTextField();

    // Input pre�o
    private static JLabel labelPreco = new JLabel("Pre�o:");
    private static JTextField fieldPreco = new JTextField();

    // Input qunatidade
    private static JLabel labelQtd = new JLabel("Quantidade:");
    private static JTextField fieldQtd = new JTextField("1");

    // Botao
    private static JButton comprar = new JButton("Comprar");
    private static JButton cancelar = new JButton("Cancelar");

    public DetalhesProduto(String camiseta_escolhida_string, int index) {
    	
    	System.out.println(index);
    	
    	int position = Data_control.getDatabase_camiseta().indexOf(camiseta_escolhida_string);
    	
        // JANELA

    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	DetalhesProduto.index= index;
    	
        janela.setLayout(null);

        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(220, 20, 1000, 50);
        
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 10));
        subtitulo1.setBounds(20, 80, 250, 50);
        
        comprar.setBounds(256, 640, 250, 50);
        comprar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        comprar.setFont(new Font("Algerian", Font.BOLD, 20));
        comprar.setBackground(Color.BLACK);
        comprar.setForeground(Color.WHITE);
        
        cancelar.setBounds(512, 640, 250, 50);
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cancelar.setFont(new Font("Algerian", Font.BOLD, 20));
        cancelar.setBackground(Color.BLACK);
        cancelar.setForeground(Color.WHITE);
        
        // INFORMA��ES PESSOAIS

        // Input nome
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(false);
        fieldNome.setText(Dados.databaseprecadastrado().getData_camiseta().get(position));
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Tamano
        labelTamanho.setBounds(20, 190, 100, 50);
        fieldTamanho.setBounds(20, 230, 100, 50);
        fieldTamanho.setEditable(false);
        fieldTamanho.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+2));
        labelTamanho.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTamanho.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Cor
        labelCor.setBounds(170, 190, 100, 50);
        fieldCor.setBounds(170, 230, 100, 50);
        fieldCor.setEditable(false);
        fieldCor.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+1));
        labelCor.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCor.setFont(new Font("Algerian", Font.BOLD, 20));
        // Iput descri��o
        labelDesc.setBounds(20, 270, 250, 50);
        fieldDesc.setBounds(20, 310, 250, 80);
        fieldDesc.setEditable(false);
        fieldDesc.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+8));
        labelDesc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDesc.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Input categoria
        labelCategoria.setBounds(380, 110, 250, 50);
        fieldCategoria.setBounds(380, 150, 250, 50);
        fieldCategoria.setEditable(false);
        fieldCategoria.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+9));
        labelCategoria.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCategoria.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Input estado
        labelComp.setBounds(380, 190, 250, 50);
        fieldComp.setBounds(380, 230, 250, 50);
        fieldComp.setEditable(false);
        fieldComp.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+3));
        labelComp.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldComp.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Ipnpu Tipo
        labelTipo.setBounds(380, 270, 250, 50);
        fieldTipo.setBounds(380, 310, 250, 50);
        fieldTipo.setEditable(false);
        fieldTipo.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+4));
        labelTipo.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTipo.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Input pre�o
        labelPreco.setBounds(730, 110, 100, 50);
        fieldPreco.setBounds(730, 150, 100, 50);
        fieldPreco.setEditable(false);
        fieldPreco.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+5));
        labelPreco.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldPreco.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // Input quantidade
        labelQtd.setBounds(880, 110, 100, 50);
        fieldQtd.setBounds(880, 150, 100, 50);
        fieldQtd.setText(Dados.databaseprecadastrado().getData_camiseta().get(position+7));
        labelQtd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldQtd.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // [ADICIONANDO A JANELA]

        janela.add(titulo);
        janela.add(subtitulo1);

        janela.add(comprar);
        janela.add(cancelar);

        // Informa��es do produto

        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelTamanho);
        janela.add(fieldTamanho);
        janela.add(labelCor);
        janela.add(fieldCor);

        janela.add(labelDesc);
        janela.add(fieldDesc);
        janela.add(labelCategoria);
        janela.add(fieldCategoria);
        janela.add(labelComp);
        janela.add(fieldComp);

        janela.add(labelTipo);
        janela.add(fieldTipo);

        janela.add(labelPreco);
        janela.add(fieldPreco);

        janela.add(labelQtd);
        janela.add(fieldQtd);

        // Cart�o de Cr�dito

        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }

    public void detalharProduto(String camiseta_escolhida_string, int index) {
        DetalhesProduto detalhesproduto = new DetalhesProduto(camiseta_escolhida_string, index);
         comprar.addActionListener(detalhesproduto);
         cancelar.addActionListener(detalhesproduto);
    }

    public static void main(String[] args) {
    	String camiseta_escolhida_string = "KongCamiseta1";
        DetalhesProduto detalhesproduto = new DetalhesProduto(camiseta_escolhida_string, index);
         comprar.addActionListener(detalhesproduto);
         cancelar.addActionListener(detalhesproduto);
    }

    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();
        	if (src == comprar) {
        		new MenuCliente(index).menu(index);
        		janela.dispose();
        	}
        	if (src == cancelar) {
        		new MenuCliente(index).menu(index);
        		janela.dispose();
        	}
    }
}
