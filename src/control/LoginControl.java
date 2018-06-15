package control;

import dao.LoginDAOImpl;

public class LoginControl {
	
	LoginDAOImpl log = new LoginDAOImpl();
	public LoginControl(){

	}
	
	public int acessar(String login, String senha){
		return log.aceder(login, senha);
	}

	public void cadastrar(){
		
	}
}
