package src.atividade;

import java.util.Date;

public class Filme {
	
	private int id;
	private String Nome;
	private int Duracao;
	private String Sinopse;
	private String Diretor;
	private Ator[] Atores;
	private String Genero;
	private String DataLancamento;
	
	public Filme(int id, String Nome, int Duracao, String Sinopse, String Diretor, Ator[] Atores, String Genero, String DataLancamento) {
		this.id = id;
		this.Nome = Nome;
		this.Duracao = Duracao;
		this.Sinopse = Sinopse;
		this.Diretor = Diretor;
		this.Atores = Atores;
		this.Genero = Genero;
		this.DataLancamento = DataLancamento;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public int getDuracao() {
		return Duracao;
	}

	public String getSinopse() {
		return Sinopse;
	}
	
	public String getDiretor() {
		return Diretor;
	}
	
	public Ator[] getAtores() {
		return Atores;
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public String getDataLancamento() {
		return DataLancamento;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public void setDuracao(int Duracao) {
		this.Duracao = Duracao;
	}

	public void setSinopse(String Sinopse) {
		this.Sinopse = Sinopse;
	}

	public void setDiretor(String Diretor) {
		this.Diretor = Diretor;
	}

	public void setGenero(String Genero) {
		this.Genero = Genero;
	}

	public void setAtores(Ator[] Atores) {
		this.Atores = Atores;
	}
}
