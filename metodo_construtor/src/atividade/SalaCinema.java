package src.atividade;

public class SalaCinema {
    private int id;
    private String Nome;
    private int Capacidade;
    private int idCinema;

    public SalaCinema(int id, String Nome, int Capacidade, int idCinema) {
        this.id = id;
        this.Nome = Nome;
        this.Capacidade = Capacidade;
        this.idCinema = idCinema;
    }

    public int getSalaCinemaId() { return id; }

    public String getSalaCinemaNome() { return Nome; }

    public int getSalaCinemaCapacidade() { return Capacidade; }

    public int getIdCinema() { return idCinema; }

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
}
