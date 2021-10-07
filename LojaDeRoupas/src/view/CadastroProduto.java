package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadastroProduto implements ActionListener {
    // [DEFININDO VARI�VEIS]

    // JANELA
    private static JFrame janela = new JFrame("Cadastro de Cliente");
    private static JLabel titulo = new JLabel("Cadastro de Produto");

    // INFORMA��ES DO PRODUTO

    // INPUT NOME
    private static JLabel labelNome = new JLabel("Didigite o nome:");
    private static JTextField fieldNome = new JTextField();

    // INPUT COR
    private static JLabel labelCor = new JLabel("Didigite a cor:");
    private static JTextField fieldCor = new JTextField();

    // INPUT TAMANHO
    private static JLabel labelTamanho = new JLabel("Didigite o tamanho:");
    private static JTextField fieldTamanho = new JTextField();

    // INPUT COMPOSI��O
    private static JLabel labelComp = new JLabel("Didigite a composi��o:");
    private static JTextField fieldComp = new JTextField();

    // INPUT TIPO
    private static JLabel labelTipo = new JLabel("Digite o tipo:");
    private static JTextField fieldTipo = new JTextField();

    // PRE�O DE VENDA
    private static JLabel labelPrecoVenda = new JLabel("Digite o valor de venda:");
    private static JTextField fieldPrecoVenda = new JTextField();
    
    // PRE�O DE F�BRICA
    private static JLabel labelPrecoFabrica = new JLabel("Digite o valor de f�brica:");
    private static JTextField fieldPrecoFabrica = new JTextField();
    
    // VOLUME (QUANTIDADE DO PRODUTO)
    private static JLabel labelEstoque = new JLabel("Digite o estoque:");
    private static JTextField fieldEstoque = new JTextField();
    
    // DESCRI��O 
    private static JLabel labelDescricao = new JLabel("Digite a descri��o:");
    private static JTextField fieldDescricao = new JTextField();
    
    // CATEGORIA
    private static JLabel labelCategoria = new JLabel("Digite a categoria:");
    private static JTextField fieldCategoria = new JTextField();
    
    // BOT�ES
    private static JButton cadastrar = new JButton("Cadastrar");
    private static JButton voltar = new JButton("Voltar");

    // CONSTRUTOR
    public CadastroProduto() {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);

        // INFORMA��ES DO PRODUTO

        // INPUT NOME
        labelNome.setBounds(50, 150, 250, 50);
        fieldNome.setBounds(50, 190, 250, 50);

        // INPUT COR
        labelCor.setBounds(50, 240, 250, 50);
        fieldCor.setBounds(50, 280, 250, 50);

        // INPUT TAMANHO
        labelTamanho.setBounds(50, 330, 250, 50);
        fieldTamanho.setBounds(50, 370, 250, 50);

        // INPUT COMPOSI��O
        labelComp.setBounds(50, 420, 250, 50);
        fieldComp.setBounds(50, 460, 250, 50);

        // INPUT TIPO
        labelTipo.setBounds(50, 510, 250, 50);
        fieldTipo.setBounds(50, 550, 250, 50);
        
        // INPUT PRE�O DE VENDA
        labelPrecoVenda.setBounds(400, 150, 250, 50);
        fieldPrecoVenda.setBounds(400, 190, 250, 50);
        
        // INPUT PRE�O DE FABRICA
        labelPrecoFabrica.setBounds(400, 240, 250, 50);
        fieldPrecoFabrica.setBounds(400, 280, 250, 50);
        
        // INPUT ESTOQUE 
        labelEstoque.setBounds(400, 330, 250, 50);
        fieldEstoque.setBounds(400, 370, 250, 50);
        
        // INPUT DESCRI��O
        labelDescricao.setBounds(400, 420, 250, 50);
        fieldDescricao.setBounds(400, 460, 250, 50);
        
        // INPUT CATEGORIA 
        labelCategoria.setBounds(400, 510, 250, 50);
        fieldCategoria.setBounds(400, 550, 250, 50);
        
        // BOT�ES
        cadastrar.setBounds(50, 640, 250, 50);
        voltar.setBounds(400, 640, 250, 50);
        
        janela.add(titulo);
        
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCor);
        janela.add(fieldCor);
        janela.add(labelTamanho);
        janela.add(fieldTamanho);
        janela.add(labelComp);
        janela.add(fieldComp);
        janela.add(labelTipo);
        janela.add(fieldTipo);
        janela.add(labelPrecoVenda);
        janela.add(fieldPrecoVenda);
        janela.add(labelPrecoFabrica);
        janela.add(fieldPrecoFabrica);
        janela.add(labelEstoque);
        janela.add(fieldEstoque);
        janela.add(labelDescricao);
        janela.add(fieldDescricao);
        janela.add(labelCategoria);
        janela.add(fieldCategoria);
        
        janela.add(cadastrar);
        janela.add(voltar);
        
        janela.setSize(750, 750);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    // M�TODO PARA SER PUXADO POR OUTRA INTERFACE
    public void cadastroProduto() {
    	CadastroProduto cadastroproduto = new CadastroProduto();
    	fieldNome.addActionListener(cadastroproduto);
    	fieldCor.addActionListener(cadastroproduto);
    	fieldTamanho.addActionListener(cadastroproduto);
    	fieldComp.addActionListener(cadastroproduto);
    	fieldTipo.addActionListener(cadastroproduto);
        fieldPrecoVenda.addActionListener(cadastroproduto);
        fieldPrecoFabrica.addActionListener(cadastroproduto);
        fieldEstoque.addActionListener(cadastroproduto);
        fieldDescricao.addActionListener(cadastroproduto);
        fieldCategoria.addActionListener(cadastroproduto);
        cadastrar.addActionListener(cadastroproduto);
        voltar.addActionListener(cadastroproduto);
    }
    
    // M�TODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
    	CadastroProduto cadastroproduto = new CadastroProduto();
    	fieldNome.addActionListener(cadastroproduto);
    	fieldCor.addActionListener(cadastroproduto);
    	fieldTamanho.addActionListener(cadastroproduto);
    	fieldComp.addActionListener(cadastroproduto);
    	fieldTipo.addActionListener(cadastroproduto);
        fieldPrecoVenda.addActionListener(cadastroproduto);
        fieldPrecoFabrica.addActionListener(cadastroproduto);
        fieldEstoque.addActionListener(cadastroproduto);
        fieldDescricao.addActionListener(cadastroproduto);
        fieldCategoria.addActionListener(cadastroproduto);
        cadastrar.addActionListener(cadastroproduto);
        voltar.addActionListener(cadastroproduto);
    }
    
    // ORIENTA��O DAS A��ES 
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == cadastrar) {
           JOptionPane.showMessageDialog(
        		   null,
        		   "Cadastro efetivado com sucesso!",
        		   null,
        		   JOptionPane.INFORMATION_MESSAGE
        		   );
        }
        if (src == voltar) {
            new MenuAdmin().menuAdmin();
        }
    }
}
