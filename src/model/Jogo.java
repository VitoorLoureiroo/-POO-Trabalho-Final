package model;

public class Jogo {

		private String titulo;
		private String foto;
		private String descricao;
		private int nota;
		private boolean emprestimo;
		private boolean troca;
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getFoto() {
			return foto;
		}
		public void setFoto(String foto) {
			this.foto = foto;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getNota() {
			return nota;
		}
		public void setNota(int nota) {
			this.nota = nota;
		}
		public boolean isEmprestimo() {
			return emprestimo;
		}
		public void setEmprestimo(boolean emprestimo) {
			this.emprestimo = emprestimo;
		}
		public boolean isTroca() {
			return troca;
		}
		public void setTroca(boolean troca) {
			this.troca = troca;
		}
		
		
}
