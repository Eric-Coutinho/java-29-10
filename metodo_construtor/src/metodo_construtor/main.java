package src.metodo_construtor;

import src.atividade.Cinema;
import src.atividade.CinemaList;
import src.atividade.SalaCinema;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// Instancia a classe CinemaList para adicionar os Cinemas existentes no arquivo
		CinemaList cinemaList = new CinemaList();

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

		// Instancia sala1 passando os atributos para o construtor
		SalaCinema sala2 = new SalaCinema(1, "Sala 2", 70, 0, cinemaList);

		// Instancia sala1 passando os atributos para o construtor
		SalaCinema sala3 = new SalaCinema(0, "Sala 1", 50, 1, cinemaList);

		System.out.println();
		// Printa a lista com os cinemas
		cinemaList.printCinemas();

	}

}
