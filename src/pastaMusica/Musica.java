package pastaMusica;

public class Musica {
    private String titulo;
    private String artista;
    private String duracao;

    public Musica(String titulo, String artista, String duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Musica {" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}