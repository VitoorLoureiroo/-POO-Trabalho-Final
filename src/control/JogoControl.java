package control;

import dao.JogoDAOImpl;
import model.Jogo;

public class JogoControl {

		JogoDAOImpl jogoImp = new JogoDAOImpl();
		
		public void incluirJogo(String titulo, String foto, String descricao, int nota, boolean emprestimo, boolean troca){
			Jogo j = new Jogo();
			j.setTitulo(titulo);
			j.setNota(nota);
			j.setFoto(foto);
			j.setDescricao(descricao);
			j.setEmprestimo(emprestimo);
			j.setTroca(troca);
			
			
			jogoImp.incluirNovoJogo(j);
		}		
}
