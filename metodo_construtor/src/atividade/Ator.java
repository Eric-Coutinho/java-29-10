package atividade;

public class Ator {
	
	private int id;
	private String Nome;
	private int Idade;
	
	public Ator(int id, String Nome, int Idade) {
		this.id = id;
		this.Nome = Nome;
		this.Idade = Idade;
		
		System.out.println("Novo Ator instanciado.");
	}
	
	public int getAtorId() {
		return id;
	}
	
	public String getAtorNome() {
		return Nome;
	}
	
	public int getAtorIdade() {
		return Idade;
	}
	
	public void setAtorId(int id) {
		this.id = id;
	}
	
	public void setAtorNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void getAtorIdade(int Idade) {
		this.Idade = Idade;
	}
}