package src.metodo_construtor;

import src.atividade.Cinema;
import src.atividade.CinemaList;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		CinemaList cinemas = new CinemaList();

		Cinema cinema = new Cinema();
		
		cinema.setId(0);
		cinema.setNome("IMAX");
		cinema.setEndereco("República Argentina, 2020");
		cinema.setCidade("Curitiba");
		
		cinema.printCinema();

		cinemas.AddNewCinema(cinema);
		
		Cinema cinema2 = new Cinema(1, "UCI", "República Argentina, 2020", "81020230");
		cinemas.AddNewCinema(cinema2);
		
		cinema2.printCinema();

		cinemas.printCinemas();

	}

}
