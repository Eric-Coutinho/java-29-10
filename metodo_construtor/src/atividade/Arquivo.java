package src.atividade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

    private String path;

    public Arquivo(String path) {
        this.path = path;
    }

    public Arquivo() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void CriarArquivo() {
        try {
            File file = new File(this.path);
            if (file.createNewFile()) {
                System.out.println("Arquivo criado no caminho: " + file.getName());
            } else {
                System.out.println("Arquivo ja existe.");
            }
        }
        catch (IOException e) {
            System.out.println("Houve um erro ao criar o arquivo.");
        }

    }

    public void SalvarDadosEmArquivo(CinemaList cinemaList) {
        try {
            FileWriter fileWriter = new FileWriter(this.path);

            CinemaList[] Cinemas = new CinemaList[0];

            if (cinemaList.getCinemas().length == 0) {
                fileWriter.write("Nenhum cinema na lista.\n");
            } else {
                fileWriter.write("Lista de Cinemas:\n");
                for (Cinema cinema : cinemaList.getCinemas()) {
                    fileWriter.write("Id: " + cinema.getId() + "\n");
                    fileWriter.write("Nome: " + cinema.getNome() + "\n");
                    fileWriter.write("Endereco: " + cinema.getEndereco() + "\n");
                    fileWriter.write("Cidade: " + cinema.getCidade() + "\n");

                    fileWriter.write("\nSalas de Cinema:\n\n");
                    for (SalaCinema sala : cinema.getSalas()) {
                        fileWriter.write("Id: " + sala.getSalaCinemaId() + "\n");
                        fileWriter.write("Nome: " + sala.getSalaCinemaNome() + "\n");
                        fileWriter.write("Capacidade: " + sala.getSalaCinemaCapacidade() + "\n");
                        fileWriter.write("IdCinema: " + sala.getIdCinema() + "\n");
                        for (Filme filme : sala.getFilmes()) {
                            fileWriter.write("    Nome: " + filme.getNome() + "\n");
                            fileWriter.write("    Duracao: " + filme.getDuracao() + "\n");
                            fileWriter.write("    Sinopse: " + filme.getSinopse() + "\n");
                            fileWriter.write("    Diretor: " + filme.getDiretor() + "\n");
                            fileWriter.write("    Genero: " + filme.getGenero() + "\n");
                            fileWriter.write("    Data de Lancamento: " + filme.getDataLancamento() + "\n");

                            fileWriter.write("    Atores:\n");

                            for (Ator ator : filme.getAtores()) {
                                fileWriter.write("        ----------------\n");
                                fileWriter.write("        Nome: " + ator.getAtorNome() + "\n");
                                fileWriter.write("        Sexo: " + ator.getAtorSexo() + "\n");
                                fileWriter.write("        Nacionalidade: " + ator.getAtorNacionalidade() + "\n");
                                fileWriter.write("        Data Nascimento: " + ator.getAtorDataNasc() + "\n");
                                fileWriter.write("        ----------------\n");
                            }
                        }
                    }
                    fileWriter.write("-------------------\n");
                }
            }

            fileWriter.close();
            System.out.println("Dados salvos no arquivo com sucesso.");
        }
        catch (IOException e) {
            System.out.println("Houve um erro ao salvar os dados no arquivo.");
        }
    }

    public void SalvarDadosEmArquivo(String text) {
        try {
            FileWriter fileWriter = new FileWriter(this.path);

            fileWriter.write(text);

            fileWriter.close();
            System.out.println("Dados salvos no arquivo com sucesso.");
        }
        catch (IOException e) {
            System.out.println("Houve um erro ao salvar os dados no arquivo.");
        }
    }

    public void LerDadosDoArquivo() {
        try {
            File file = new File(this.path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch (IOException e) {
            System.out.println("Houve um erro ao ler os dados no arquivo.");
        }
    }

    public void AlterarDadosDoArquivo(String newText) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados do arquivo: ");
        this.LerDadosDoArquivo();

        System.out.println("Dados a serem salvos no arquivo: ");
        System.out.println(newText);

        System.out.println("Deseja alterar os dados do arquivo?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        int choice = scanner.nextInt();

        if (choice == 1) {
            this.SalvarDadosEmArquivo(newText);
        }
        else {
            System.out.println("Operacao cancelada.");
        }

    }

    public void ExcluirArquivo() {
        File file = new File(this.path);

        if (file.delete()) {
            System.out.println("Arquivo deletado com sucesso.");
        }
        else {
            System.out.println("Houve um erro ao deletar o arquivo.");
        }
    }

}
