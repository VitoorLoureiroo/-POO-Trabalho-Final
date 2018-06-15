package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.LoginControl;

public class LoginView implements ActionListener{

		private String login ="";
		private String senha = "";
		private JButton btnLogin = new JButton("Acessar");
		private JButton btnCadastrar = new JButton("Cadastre-se!");
		private JTextField txtLogin = new JTextField();
		private JTextField txtSenha = new JTextField();
		
		private LoginControl controle = new LoginControl();
		
		public static void main(String[] args){
			new LoginView();
		}
		
		public LoginView(){
			JFrame janela = new JFrame("Acesso ao sistema");
			JPanel principal = new JPanel(new BorderLayout());
			JPanel painel1 = new JPanel(new GridLayout(2,1));
			JPanel painel2 = new JPanel(new GridLayout(3,2));
			JPanel painel3 = new JPanel();
			
			painel2.add(new JLabel("Login"));
			painel2.add(txtLogin);
			painel2.add(new JLabel("Senha"));
			painel2.add(txtSenha);
			painel3.add(btnLogin);
			
			painel1.add(new JLabel("Ainda não possui cadastro?"));
			painel1.add(btnCadastrar);
			
			btnLogin.addActionListener(this);
			btnCadastrar.addActionListener(this);
			
			principal.add(painel2, BorderLayout.NORTH);
			principal.add(painel3, BorderLayout.CENTER);
			principal.add(painel1, BorderLayout.SOUTH);
			
			janela.setContentPane(principal);
			janela.setSize(250,250);
			janela.setVisible(true);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String cmd = arg0.getActionCommand();
		if ("Acessar".equals(cmd)){
			login = txtLogin.getText();
			senha = txtSenha.getText();
			if (controle.acessar(login, senha)==1){
				JOptionPane.showMessageDialog(null, "Boa, Login Valido!");
			}else{
				JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos. verifique");;
			}
			
		}else if ("Cadastrar".equals(cmd)){
			controle.cadastrar();
		}
		
	}

}
