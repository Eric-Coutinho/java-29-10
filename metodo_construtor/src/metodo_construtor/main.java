package metodo_construtor;

import atividade.Cinema;

public class main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		
		cinema.setId(0);
		cinema.setNome("IMAX");
		cinema.setEndereco("República Argentina, 2020");
		cinema.setCep("81020230");
		
		cinema.printCinema();
		
		Cinema cinema2 = new Cinema(1, "UCI", "República Argentina, 2020", "81020230");
		
		cinema2.printCinema();

	}

}
