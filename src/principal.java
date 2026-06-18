
import br.com.alura.desafio.modelo.Musica;
import br.com.alura.desafio.modelo.podcast;

public class principal {
    public static void main(String[] args){
        Musica musica1 = new Musica();
        musica1.setTitulo("Até Que Durou");
        musica1.setDuracao(3);
        musica1.setCantor("Pericles");
        musica1.setAlbum("Remake das melhores");
        musica1.setGenero("Paagode");

        musica1.descricaoDaMusica();

        podcast podcast1 = new podcast();
        podcast1.setTitulo("IA Vai acabar com os devs");
        podcast1.setTitulo("Igor");
        podcast1.setDuracao(200);
        podcast1.setAlbum("IA");
        podcast1.descricaoDoPodcast();



    }
}
