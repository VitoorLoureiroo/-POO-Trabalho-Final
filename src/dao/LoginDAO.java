package dao;

public interface LoginDAO {

		int aceder(String login, String senha);
		
		void cadastrar(String login, String senha);
}
