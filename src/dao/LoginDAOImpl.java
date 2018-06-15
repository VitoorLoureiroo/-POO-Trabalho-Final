package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAOImpl implements LoginDAO{
		
		private Connection con;
		private Connection criaConexao(){
			try{
				Class.forName("org.mariadb.jdbc.Driver");
				String urldb = "jdbc:mariadb://localhost:3306/finalpoo";
				con = DriverManager.getConnection(urldb, "Admin", "123");
			}catch(ClassNotFoundException ec){
				ec.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return con;
		}
		
	@Override
	public int aceder(String login, String senha) {
		// TODO Auto-generated method stub
		int ctr = 0;
		Connection con = criaConexao();
		try{
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM login WHERE lg_login = '" + login + "'";
			sql = sql + "AND lg_senha = '" + senha + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.first() == !false){
				ctr = 1;
			}
			else{
				ctr = 0;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ctr;
		}

	@Override
	public void cadastrar(String login, String email) {
		// TODO Auto-generated method stub
		
	}
	}
