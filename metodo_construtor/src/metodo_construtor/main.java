package src.metodo_construtor;

import src.atividade.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Instancia a classe CinemaList para adicionar os Cinemas existentes no array
		CinemaList cinemaList = new CinemaList();

		// Mockando dados dos atores
		Ator ator1 = new Ator(0, "Leonardo DiCaprio", "Masculino", "Americano", "1974/11/11");
		Ator ator2 = new Ator(1, "Meryl Streep", "Feminino", "Americana", "1949/06/22");
		Ator ator3 = new Ator(2, "Denzel Washington", "Masculino", "Americano", "1954/12/28");
		Ator ator4 = new Ator(3, "Natalie Portman", "Feminino", "Israelense", "1981/06/09");
		Ator ator5 = new Ator(4, "Brad Pitt", "Masculino", "Americano", "1963/12/18");

		// Mockando lista com atores
		Ator[] Atores1 = {ator1, ator2, ator3, ator4, ator5};
		Ator[] Atores2 = {ator3, ator5};
		Ator[] Atores3 = {ator1, ator2, ator4};

		// Mockando dados dos filmes
		Filme filme1 = new Filme(0, "Titanic 2", 195, "Continuacao do grande filme do titanic.", "Michael Bay", Atores1, "Romance", "2027/03/19");
		Filme filme2 = new Filme(1, "O Protetor", 125, "Denzel Washington busca justica contra mal feitores.", "Christopher Nolan", Atores2, "Acao", "2025/09/02");
		Filme filme3 = new Filme(2, "Mamma Mia 3", 98, "Ultimo episodio da serie Mamma Mia, agora com novos personagens.", "Phyllida Lloyd", Atores3, "Romance/Musical", "2029/12/04");

		// Mockando lista com filmes
		Filme[] Filmes1 = {filme1, filme2, filme3};
		Filme[] Filmes2 = {filme1, filme3};
		Filme[] Filmes3 = {filme2};

		// Instancia cinema com construtor vazio
		Cinema cinema = new Cinema();

		// Seta os atributos do cinema
		cinema.setId(0);
		cinema.setNome("IMAX");
		cinema.setEndereco("República Argentina, 2020");
		cinema.setCidade("Curitiba");

		// Adiciona o cinema na lista de cinemas
		cinemaList.AddNewCinema(cinema);

		// Instancia cinema2 passando os atributos para o construtor
		Cinema cinema2 = new Cinema(1, "UCI", "República Argentina, 2020", "81020230");

		// Adiciona o cinema2 na lista de cinemas
		cinemaList.AddNewCinema(cinema2);

		// Instancia sala1 passando os atributos para o construtor
		SalaCinema sala1 = new SalaCinema(0, "Sala 1", 100, 0, cinemaList);
		// Mockando lista com filmes
		sala1.setFilmes(Filmes1);

		// Instancia sala2 passando os atributos para o construtor
		SalaCinema sala2 = new SalaCinema(1, "Sala 2", 70, 0, cinemaList);
		// Mockando lista com filmes
		sala2.setFilmes(Filmes2);

		// Instancia sala3 passando os atributos para o construtor
		SalaCinema sala3 = new SalaCinema(0, "Sala 1", 50, 1, cinemaList);
		// Mockando lista com filmes
		sala3.setFilmes(Filmes3);

		System.out.println();
		// Printa a lista com os cinemas
		cinemaList.printCinemas();

		int choice = 1;
		String path;

		Scanner scanner = new Scanner(System.in);

		// Interacao do usuario com o console para manipular os arquivos
		while (choice != 0) {
			System.out.println("--------- MANIPULAR DADOS ---------");
			System.out.println();
			System.out.println("1 - Criar arquivo");
			System.out.println("2 - Salvar dados dos cinemas no arquivo");
			System.out.println("3 - Ler dados do arquivo");
			System.out.println("4 - Alterar dados no arquivo");
			System.out.println("5 - Excluir arquivo");
			System.out.println();
			System.out.println("O que deseja fazer?");
			System.out.println();

			choice = scanner.nextInt();

			Arquivo arquivo = new Arquivo();

			switch (choice) {
				case 1:
					System.out.println("Qual o caminho e nome do arquivo a ser criado?");
					System.out.println("ex: C:\\Users\\Desktop\\Dados\\Dados.txt");
					path = scanner.next();
					arquivo.setPath(path);
					arquivo.CriarArquivo();
					break;

				case 2:
					System.out.println("Qual o caminho do arquivo onde os dados serao salvos?");
					System.out.println("ex: C:\\Users\\Desktop\\Dados\\Dados.txt");
					path = scanner.next();
					arquivo.setPath(path);
					arquivo.SalvarDadosEmArquivo(cinemaList);
					break;

				case 3:
					System.out.println("Qual o caminho do arquivo a ser lido?");
					System.out.println("ex: C:\\Users\\Desktop\\Dados\\Dados.txt");
					path = scanner.next();
					arquivo.setPath(path);
					arquivo.LerDadosDoArquivo();
					break;

				case 4:
					System.out.println("Qual o caminho do arquivo a ser alterado?");
					System.out.println("ex: C:\\Users\\Desktop\\Dados\\Dados.txt");
					path = scanner.next();
					arquivo.setPath(path);
					System.out.println("Qual as novas informacoes do arquivo?");
					String newText = scanner.nextLine();
					arquivo.AlterarDadosDoArquivo(newText);
					break;
				case 5:
					System.out.println("Qual o caminho do arquivo a ser apagado?");
					System.out.println("ex: C:\\Users\\Desktop\\Dados\\Dados.txt");
					path = scanner.next();
					arquivo.setPath(path);
					arquivo.ExcluirArquivo();
					break;

				case 0:
					break;

				default:
					System.out.println("Opcao invalida, para sair digite 0");
					System.out.println();
					choice = scanner.nextInt();
					break;
			}

		}

		scanner.close();

	}
}
