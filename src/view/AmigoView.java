package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AmigoView {
	
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	public AmigoView(){
		JFrame janela = new JFrame();
		JPanel principal = new JPanel(new BorderLayout());
		JScrollPane scroll = new JScrollPane();
		JPanel painel1 = new JPanel(new GridLayout(1,1));
		
		tabela = new JTable(modelo);
		modelo.addColumn("Id");
		modelo.addColumn("Email");
		modelo.addColumn("Apelido");
		//a partir daqui solicitar retrieve
		
		scroll.getViewport().add(tabela);
		janela.setContentPane(principal);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
