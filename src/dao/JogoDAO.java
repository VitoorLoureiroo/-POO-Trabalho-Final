package dao;

import java.util.List;

import model.Jogo;

public interface JogoDAO {

		void incluirNovoJogo(Jogo j);
		
		void editarJogo(Jogo j);
		
		void excluirJogo(Jogo j);
		
		List<Jogo> pesquisarJogosAmigo(int idAmigo);
		
}
