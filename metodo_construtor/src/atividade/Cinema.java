package src.atividade;

public class Cinema {
	
	private int id;
	private String Nome;
	private String Endereco;
	private String Cidade;
	private SalaCinema[] Salas = new SalaCinema[0];
	
	public Cinema(int id, String Nome, String Endereco, String Cidade) {
		this.id = id;
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Cidade = Cidade;
	}

	public Cinema() { }

	public int getId() {
		return id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public String getCidade() {
		return Cidade;
	}

	public SalaCinema[] getSalas() {
		return Salas;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	
	public void setCidade(String Cidade) {
		this.Cidade = Cidade;
	}
	
	public void printCinema() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.Nome);
		System.out.println("Endereco: " + this.Endereco);
		System.out.println("Cidade: " + this.Cidade);
		System.out.println();
		System.out.println("Salas de Cinema: ");
		for (int i = 0; i < Salas.length; i++) {
			Salas[i].printSalaCinema();
		}
		System.out.println("-------------------");
	}

	public void AddNewSala(SalaCinema sala) {
		if (sala.getIdCinema() != this.getId()) {
			throw new Error("Os Ids nao correspondem.");
		}

		if (Salas == null) {
			Salas = new SalaCinema[0];
		}

		SalaCinema[] newSala = new SalaCinema[Salas.length + 1];

		for (int i = 0; i < Salas.length; i++) {
			newSala[i] = Salas[i];
		}

		newSala[Salas.length] = sala;
		Salas = newSala;
	}

}
