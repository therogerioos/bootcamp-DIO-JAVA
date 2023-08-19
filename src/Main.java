// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import pastaMusica.Musica;
import pastaMusica.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.adicionarMusica("Menino da porteira", "Leonardo", "00:03:20");
        reprodutor.adicionarMusica("Asa Branca", "Luiz Gonzaga", "00:04:15");
        reprodutor.adicionarMusica("São João de todos os tempos", "Mastruz com Leite", "00:05:30");
        reprodutor.adicionarMusica("Minha Rainha", "Cavaleiros do Forró", "00:03:00");
        reprodutor.adicionarMusica("A Viagem", "Roupa Nova", "00:04:12");

        reprodutor.setMusicaEscolhida(2);

        System.out.println("_____________________________Adicionando música na playlist_______________________________\n");

        System.out.println(reprodutor.getListaDeMusicas());

        System.out.println("__________________________________Selecionando música_____________________________________\n");

        reprodutor.musicaTocando(reprodutor.getMusicaEscolhida());

        System.out.println("Selecionando música.....");

        System.out.println("_________________________________Listando a música atual__________________________________\n");

        reprodutor.getMusicaAtual();

        System.out.println("_____________________________________Reproduzir música____________________________________\n");

        reprodutor.getReproduzir();

        System.out.println("_________________________________Reproduzir música anterior_______________________________\n");

        reprodutor.musicaAnterior(reprodutor.getMusicaEscolhida());

        reprodutor.getMusicaAtual();

        System.out.println("_________________________________Reproduzir próxima música________________________________\n");

        reprodutor.musicaProxima(reprodutor.getMusicaEscolhida());

        reprodutor.getMusicaAtual();

        System.out.println("_______________________________________Pausando musica____________________________________\n");

        reprodutor.getPausando();

        System.out.println("_______________________________Removendo música da playlist_______________________________\n");

        reprodutor.removerMusica(3);

        System.out.println("__________________________________Musicas atuais salvas___________________________________\n");

        System.out.println(reprodutor.getListaDeMusicas());

    }
}