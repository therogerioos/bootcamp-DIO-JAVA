package pastaInternet;

public class PaginaWEB {
    private String url;

    private String conteudo;

    public PaginaWEB(String url, String conteudo) {
        this.url = url;
        this.conteudo = conteudo;
    }

    public String getUrl() {
        return url;
    }

    public String getConteudo() {
        return conteudo;
    }
}
