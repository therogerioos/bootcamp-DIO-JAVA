package pastaChamada;

public class Ligacao {

    private String numeroOrigem;

    private String numeroDestino;

    private String duracao;

    public Ligacao(String numeroOrigem, String numeroDestino, String duracao) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
        this.duracao = duracao;
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public String getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Ligacao{" +
                "numeroOrigem='" + numeroOrigem + '\'' +
                ", numeroDestino='" + numeroDestino + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
