package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.JogoControl;

public class JogoView implements ActionListener{
	
	private String titulo;
	private String foto;
	private String descricao;
	private int nota;
	private boolean emprestimo;
	private boolean troca;
	
	private JTextField txtTitulo = new JTextField();
	private JTextField txtFoto = new JTextField();
	private JTextField txtDescricao = new JTextField();
	private JTextField txtNota = new JTextField();
	
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnLimpar = new JButton("Limpar");
	
	private JCheckBox chkEmprestimo = new JCheckBox("Disponível para Emprestimo?");
	private JCheckBox chkTroca = new JCheckBox("Disponível para troca?");
	
	private JogoControl controle = new JogoControl();
	
	public static void main(String[] args){
		new JogoView();
	}
	
	public JogoView(){
		
		JFrame janela = new JFrame("Inclusão/Troca de jogos");
		JPanel principal = new JPanel(new BorderLayout());
		JPanel painel1 = new JPanel(new GridLayout(4,4));
		JPanel painel2 = new JPanel(new GridLayout(4,4));
		//JPanel painel3 = new JPanel(new GridLayout(1,1));
		JPanel painel4 = new JPanel(new GridLayout(1,1));
		
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnSalvar.addActionListener(this);
		
		//principal.add(label1, BorderLayout.NORTH);
		
		painel1.add(new JLabel("Titulo"));
		painel1.add(txtTitulo);
		painel1.add(new JLabel("Nota"));
		painel1.add(txtNota);
		painel1.add(new JLabel("Foto"));
		painel1.add(txtFoto);
		painel2.add(new JLabel("Descrição"));
		painel2.add(txtDescricao);
		painel2.add(chkTroca);
		painel2.add(chkEmprestimo);
		
		painel4.add(btnLimpar);
		painel4.add(btnSalvar);
		painel4.add(btnExcluir);
				
		principal.add(painel1, BorderLayout.NORTH);
		principal.add(painel2, BorderLayout.CENTER);
		//principal.add(painel3, BorderLayout.CENTER);
		principal.add(painel4, BorderLayout.SOUTH);
		
		janela.setContentPane(principal);
		janela.setSize(400,400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String cmd = arg0.getActionCommand();
		if(cmd.equals("Salvar")){
			titulo = txtTitulo.getText();
			foto = txtFoto.getText();
			descricao = txtDescricao.getText();
			nota = Integer.parseInt(txtNota.getText());
			emprestimo = chkEmprestimo.isSelected();
			troca = chkTroca.isSelected();
			controle.incluirJogo(titulo, foto, descricao, nota, emprestimo, troca);
		}else if (cmd.equals("Excluir")){
			
		}else if (cmd.equals("Limpar")){
			
		}
	}
	
}
