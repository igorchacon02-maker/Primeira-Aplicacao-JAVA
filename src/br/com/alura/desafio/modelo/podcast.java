package br.com.alura.desafio.modelo;

public class podcast extends Audio {
    private String apresentador;
    private String album;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public void descricaoDoPodcast() {
        String descricao = """
            Nome do Apresentador: %s
            Album: %s
            """.formatted(getTitulo(), getApresentador(), getAlbum());

        System.out.println(descricao);
    }
}
