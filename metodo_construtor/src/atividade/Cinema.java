package atividade;

public class Cinema {
	
	private int id;
	private String Nome;
	private String Endereco;
	private String Cep;
	
	public Cinema(int id, String Nome, String Endereco, String Cep) {
		this.id = id;
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Cep = Cep;
		
		System.out.println("Novo Cinema instanciado com atributos");
	}
	
	public Cinema() {
		System.out.println("Novo Cinema instanciado (vazio)");
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public String getCep() {
		return Cep;
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
	
	public void setCep(String Cep) {
		this.Cep = Cep;
	}
	
	public void printCinema() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.Nome);
		System.out.println("Endereco: " + this.Endereco);
		System.out.println("Cep: " + this.Cep);
	}
	

}
