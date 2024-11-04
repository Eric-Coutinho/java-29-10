package src.atividade;

public class SalaCinema {
    private int id;
    private String Nome;
    private int Capacidade;
    private int idCinema;
    private CinemaList cinemaList;
    private Filme[] filmes;

    public SalaCinema(int id, String Nome, int Capacidade, int idCinema, CinemaList cinemaList) {
        this.id = id;
        this.Nome = Nome;
        this.Capacidade = Capacidade;
        this.idCinema = idCinema;
        this.cinemaList = cinemaList;

        Cinema cinema = cinemaList.getCinemaById(this.idCinema);
        if (cinema != null) {
            cinema.AddNewSala(this);
        } else {
            throw new Error("Id do cinema não encontrado.");
        }
    }

    public int getSalaCinemaId() { return id; }

    public String getSalaCinemaNome() { return Nome; }

    public int getSalaCinemaCapacidade() { return Capacidade; }

    public int getIdCinema() { return idCinema; }

    public Filme[] getFilmes() { return filmes; }

    public void setIdSalaCinema(int id) { this.id = id; }

    public void setNomeSalaCinema(String Nome) { this.Nome = Nome; }

    public void setCapacidadeSalaCinema(int Capacidade) { this.Capacidade = Capacidade; }

    public void setIdCinema(int idCinema) {
        CinemaList cinemaList = new CinemaList();
        Cinema[] cinemas = cinemaList.getCinemas();

        for (int i = 0; i < cinemas.length; i++) {
            if (cinemas[i].getId() == idCinema) {
                this.idCinema = idCinema;
                break;
            }
        }
        throw new Error("Id do Cinema invalido.");
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }

    public void printSalaCinema() {
        System.out.println();
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.Nome);
        System.out.println("Capacidade: " + this.Capacidade);
        System.out.println("IdCinema: " + this.idCinema);
        System.out.println("Filmes em exibicao: ");

        for (int i = 0; i < filmes.length; i++) {

            System.out.println();

            System.out.println("    Nome: " + filmes[i].getNome());
            System.out.println("    Duracao: " + filmes[i].getDuracao());
            System.out.println("    Sinopse: " + filmes[i].getSinopse());
            System.out.println("    Diretor: " + filmes[i].getDiretor());

            Ator[] atores = filmes[i].getAtores();
            System.out.println("    Atores: ");

            for (int j = 0; j < atores.length; j++) {
                System.out.println();
                System.out.println("        ----------------");
                System.out.println("        Nome: " + atores[j].getAtorNome());
                System.out.println("        Sexo: " + atores[j].getAtorSexo());
                System.out.println("        Nacionalidade: " + atores[j].getAtorNacionalidade());
                System.out.println("        Data Nascimento: " + atores[j].getAtorDataNasc());
                System.out.println("        ----------------");
            }

            System.out.println("    Genero: " + filmes[i].getGenero());
            System.out.println("    DataLancamento: " + filmes[i].getDataLancamento());
        }
    }

    public void AddNewFilme(Filme filme) {
        if (filmes == null) {
            filmes = new Filme[0];
        }

        Filme[] newFilmes = new Filme[filmes.length + 1];

        for (int i = 0; i < filmes.length; i++) {
            newFilmes[i] = filmes[i];
        }

        newFilmes[filmes.length] = filme;
        filmes = newFilmes;
    }

}
