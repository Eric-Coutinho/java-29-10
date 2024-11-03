package src.atividade;

public class Ator {
	
	private int id;
	private String Nome;
	private String Sexo;
	private String Nacionalidade;
	private String DataNasc;

	public Ator(int id, String Nome, String Sexo, String Nacionalidade, String DataNasc) {
		this.id = id;
		this.Nome = Nome;
		this.Sexo = Sexo;
		this.Nacionalidade = Nacionalidade;
		this.DataNasc = DataNasc;
		
		System.out.println("Novo Ator instanciado.");
	}
	
	public int getAtorId() {
		return id;
	}
	
	public String getAtorNome() {
		return Nome;
	}
	
	public String getAtorSexo() {
		return Sexo;
	}

	public String getAtorNacionalidade() {
		return Nacionalidade;
	}

	public String getAtorDataNasc() {
		return DataNasc;
	}
	
	public void setAtorId(int id) {
		this.id = id;
	}
	
	public void setAtorNome(String Nome) {
		this.Nome = Nome;
	}

	public void setAtorSexo(String Sexo) {
		this.Sexo = Sexo;
	}

	public void setAtorNacionalidade(String Nacionalidade) {
		this.Nacionalidade = Nacionalidade;
	}

	public void setAtorDataNasc(String DataNasc) {
		this.DataNasc = DataNasc;
	}
}
