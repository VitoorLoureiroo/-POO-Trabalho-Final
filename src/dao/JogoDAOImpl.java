package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import model.Jogo;

public class JogoDAOImpl implements JogoDAO {

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
	public void incluirNovoJogo(Jogo j) {
		// TODO Auto-generated method stub
		Connection con = criaConexao();
		try{
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO jogo VALUES (2, '"+j.getTitulo() + "', ";
			sql = sql + j.getNota() + " , '" + j.getFoto() + "', '";
			sql = sql + j.getDescricao() + "', " + j.isEmprestimo() + ", ";
			sql = sql + j.isTroca() + ");";
			stmt.executeQuery(sql);
				JOptionPane.showMessageDialog(null, "Jogo incluido com sucesso!");		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao incluir jogo!");
			e.printStackTrace();
		}		
	}

	@Override
	public void editarJogo(Jogo j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirJogo(Jogo j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jogo> pesquisarJogosAmigo(int idAmigo) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
