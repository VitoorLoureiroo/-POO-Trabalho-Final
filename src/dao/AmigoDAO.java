package dao;

import java.util.List;

import model.Amigo;
 

public interface AmigoDAO {

		List<Amigo> pesquisarAmigo(String login, String apelido);
		
		
}
