package pastaMusica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<Musica> listagemDeMusicas;
    private Musica musicaAtual;
    private int musicaEscolhida;
    public ReprodutorMusical() {

        this.listagemDeMusicas = new ArrayList<>();
        this.musicaEscolhida = 0;
    }
    public void adicionarMusica(String titulo, String artista, String duracao) {
        listagemDeMusicas.add(new Musica(titulo, artista, duracao));
    }

    public void removerMusica(int indiceParaRemover) {
        System.out.println("_______________________________Removendo música da playlist_______________________________\n");
        if (indiceParaRemover >= 0 && indiceParaRemover < listagemDeMusicas.size()) {
            Musica removeMusic = listagemDeMusicas.get(indiceParaRemover);
            listagemDeMusicas.remove(indiceParaRemover);
            System.out.println("Música removida da playlist: " + "\nTítulo: " + removeMusic.getTitulo() + "\nArtista: " + removeMusic.getArtista() + "\nDuração: " + removeMusic.getDuracao());
        } else {
            System.out.println("Índice inválido para remoção.");
        }

    }

    public void musicaTocando(int indice) {
        if (indice >= 0 && indice < listagemDeMusicas.size()) {
            musicaAtual = listagemDeMusicas.get(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void musicaAnterior(int indice) {
        System.out.println("_________________________________Reproduzir música anterior_______________________________\n");
        if (indice == 0) {
            int ultimoIndice = listagemDeMusicas.size() - 1;
            musicaEscolhida = ultimoIndice;
            musicaAtual = listagemDeMusicas.get(ultimoIndice);
        }

        else if (indice >= 0 && indice < listagemDeMusicas.size()){
            musicaAtual = listagemDeMusicas.get(indice - 1);
            musicaEscolhida = indice - 1;

        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void musicaProxima(int indice) {
        System.out.println("_________________________________Reproduzir próxima música________________________________\n");
        if (indice < listagemDeMusicas.size() && indice >= listagemDeMusicas.size() - 1) {
            musicaAtual = listagemDeMusicas.get(0);
            musicaEscolhida = 0;
        }

        else if (indice >= 0 && indice < listagemDeMusicas.size()){
            musicaAtual = listagemDeMusicas.get(indice + 1);
            musicaEscolhida = indice + 1;

        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void getMusicaAtual() {
        System.out.println("_________________________________Listando a música atual__________________________________\n");
        if (musicaAtual != null) {
            System.out.println("Música atual: " + musicaAtual.getTitulo() + " - " + musicaAtual.getArtista() + "\n");
        } else {
            System.out.println("Nenhuma música atual definida.");
        }
    }

    public List<String> getListaDeMusicas() {
        System.out.println("_____________________________Adicionando música na playlist_______________________________\n");
        List<String> listamusic = new ArrayList<>();
        for(Musica musica: listagemDeMusicas) {
            String formato = "\nTitulo: " + musica.getTitulo() + "\nArtista: " + musica.getArtista() + "\nDuração: " + musica.getDuracao() +"\n";

            listamusic.add(formato);
        }
        return listamusic;
    }

    public void getReproduzir(){
        System.out.println("_____________________________________Reproduzir música____________________________________\n");
        if (musicaAtual != null) {
            System.out.println("Reproduzindo: " + "\nTítulo: " + musicaAtual.getTitulo() + "\nArtista: " + musicaAtual.getArtista() + "\nDuração: " + musicaAtual.getDuracao());
        } else {
            System.out.println("Nenhuma música atual definida.");
        }
    }

    public void getPausando(){
        System.out.println("_______________________________________Pausando musica____________________________________\n");
        System.out.println("Pausando: " + musicaAtual.getTitulo());
    }

    public int getMusicaEscolhida() {
        System.out.println("__________________________________Selecionando música_____________________________________\n");
        return musicaEscolhida;
    }

    public void setMusicaEscolhida(int novoIndice) {
        if (novoIndice >= 0 && novoIndice < listagemDeMusicas.size()) {
            musicaEscolhida = novoIndice;
        } else {
            System.out.println("Índice inválido.");
        }
    }



}

