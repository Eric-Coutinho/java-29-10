package src.atividade;

public class CinemaList {
    private Cinema[] Cinemas = new Cinema[0];

    public CinemaList() {}

    public Cinema[] getCinemas() {
        return Cinemas;
    }

    public Cinema getCinemaById(int idCinema) {
        if (Cinemas.length == 0) {
            System.out.println("Nenhum cinema na lista.");
        }
        else {
            for (int i = 0; i < Cinemas.length; i++) {
                if (Cinemas[i].getId() == idCinema) {
                    return Cinemas[i];
                }
            }
        }
        return null;
    }

    public void printCinemas() {
        if (Cinemas.length == 0) {
            System.out.println("Nenhum cinema na lista.");
        }
        else {
            System.out.println("Lista de Cinemas:");
            for (int i = 0; i < Cinemas.length; i++) {
                Cinemas[i].printCinema();
            }
        }
    }

    public void setCinemas(Cinema[] cinemas) {
        Cinemas = cinemas;
    }

    public void AddNewCinema(Cinema cinema) {
        if (Cinemas == null) {
            Cinemas = new Cinema[0];
        }

        Cinema[] newCinemas = new Cinema[Cinemas.length + 1];

        for (int i = 0; i < Cinemas.length; i++) {
            newCinemas[i] = Cinemas[i];
        }

        newCinemas[Cinemas.length] = cinema;
        Cinemas = newCinemas;
    }

}
