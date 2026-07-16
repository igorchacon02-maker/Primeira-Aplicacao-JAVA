 package br.com.alura.desafio.modelo;

public class Musica extends Audio {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void descricaoDaMusica() {
        String descricao = """
            Nome da Música: %s
            Nome do Cantor: %s
            Album: %s
            Genero: %s
            """.formatted(getTitulo(), getCantor(), getAlbum(), getGenero());

        System.out.println(descricao);
    }
}

