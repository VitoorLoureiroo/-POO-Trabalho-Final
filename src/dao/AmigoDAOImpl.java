package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Amigo;

public class AmigoDAOImpl implements AmigoDAO{

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
	public List<Amigo> pesquisarAmigo() {
		
		Connection con = criaConexao();
		List<Amigo> listaAmigos = new ArrayList<>();
		try{
			Statement stmt = con.createStatement();
			String sql = "";
			
			stmt.executeQuery(sql);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro! Verifique!");
			e.printStackTrace();
		}
		
		
		return listaAmigos;
	}

}
