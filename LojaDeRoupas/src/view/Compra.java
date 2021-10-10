package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import controller.Product_control;

//import controller.ControleCompra;

public class Compra implements ActionListener {

	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index = 2;
    
    private ArrayList<String> nomeCamisetas_arraylist = Product_control.nomeCamisetas();
    private String[] lista = nomeCamisetas_arraylist.toArray(new String [nomeCamisetas_arraylist.size()]); 

    JList<String> listprodutos = new JList<String>(lista);
    DefaultListCellRenderer renderer =  (DefaultListCellRenderer)listprodutos.getCellRenderer();  

    // JANELA
    private static JFrame janela = new JFrame("Compra");
    private static JLabel titulo = new JLabel("Camisetas dispon�veis");
    // Lista de Produtos

    // Botao
    private static JButton detalhesDoProduto = new JButton("Detalhes do Produto");
    private static JButton voltar = new JButton("Voltar");

    public Compra(int index) {
    	
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	Compra.index= index;
    	
        janela.setLayout(null);
        //Cria uma inst�ncia do renderizador de c�lulas da lista.
        
        //Define o renderizador da lista

        titulo.setFont(new Font("Algerian", Font.BOLD,50));
        titulo.setBounds(205, 80, 1000, 70);
        
        //POSI��O DOS ELEMENTOS DA JLIST
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        //BORDA DA JLIST
        listprodutos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        listprodutos.setBackground(new Color(220,220,220));
        //TAMANHO DA JLIST E POSICIONAMENTO
        listprodutos.setBounds(380, 200, 250, 300);
        //COR DOS ELEMENTOS NA JLIST
        listprodutos.setForeground(Color.BLACK);
        //DIMENS�ES DAS C�LULAS QUE CONTEM CADA ELEMENTO DA JLIST
        listprodutos.setFixedCellHeight(60);
        listprodutos.setFixedCellWidth(50);
        //CORES DE INTERA��O AO CLICK
        listprodutos.setSelectionBackground(new Color(212,175,55));
        listprodutos.setSelectionForeground(Color.WHITE);
        //FONTE DA JLIST
        listprodutos.setFont(new Font("Algerian", Font.BOLD, 20));
        
        detalhesDoProduto.setBounds(380, 530, 250, 50);
        detalhesDoProduto.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        detalhesDoProduto.setFont(new Font("Algerian", Font.BOLD, 20));
        detalhesDoProduto.setBackground(Color.BLACK);
        detalhesDoProduto.setForeground(Color.WHITE);
        
        voltar.setBounds(380, 600, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        
        janela.add(listprodutos);
        janela.add(detalhesDoProduto);
        janela.add(voltar);
        janela.add(titulo);
        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

    }

    public void comprarProduto(int index) {
        Compra compraproduto = new Compra(index);
        detalhesDoProduto.addActionListener(compraproduto);
        voltar.addActionListener(compraproduto);
    }

    public static void main(String[] args) {
        Compra compraproduto = new Compra(index);
        detalhesDoProduto.addActionListener(compraproduto);
        voltar.addActionListener(compraproduto);
    }

    public void actionPerformed(ActionEvent e) {
    	System.out.println(index);
    	Object src = e.getSource();
      	int position = listprodutos.getSelectedIndex();
    	String camiseta_escolhida_string = lista[position];
    	
        if (src == detalhesDoProduto) {
           	
        	System.out.print(camiseta_escolhida_string);
            new DetalhesProduto(camiseta_escolhida_string, index).detalharProduto(camiseta_escolhida_string, index);
        	janela.dispose();
        	
        }
        
        if (src == voltar) {
        	new MenuCliente(2).menu(2);
        	janela.dispose();
        	
        }	
        
    }
}
