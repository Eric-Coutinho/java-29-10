package src.atividade;

public class Cinema {
	
	private int id;
	private String Nome;
	private String Endereco;
	private String Cidade;
	
	public Cinema(int id, String Nome, String Endereco, String Cidade) {
		this.id = id;
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Cidade = Cidade;

		System.out.println("Novo Cinema instanciado com atributos");
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
	}

}
