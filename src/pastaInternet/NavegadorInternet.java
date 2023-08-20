package pastaInternet;


import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {

    private List<PaginaWEB> historico;

    private PaginaWEB paginaAtual;

    public NavegadorInternet() {
        this.historico = new ArrayList<>();
    }

    public void abrirPagina(String url, String conteudo) {
        System.out.println("_________________________________Abrindo página___________________________________________\n");
        PaginaWEB pagina = new PaginaWEB(url, conteudo);
        historico.add(pagina);
        int posicao = historico.indexOf(pagina);
        paginaAtual = historico.get(posicao);
        System.out.println("URL: " + paginaAtual.getUrl() + "\n\n\n" + "Conteúdo: " + paginaAtual.getConteudo());

    }

    public void voltar(){
        System.out.println("_____________________________Voltando para página anterior________________________________\n");
        int posicao = historico.indexOf(paginaAtual);
        if (posicao == 0){
            System.out.println("Não é possível retornar.");
        } else {
            paginaAtual = historico.get(posicao - 1);
            System.out.println("URL: " + paginaAtual.getUrl() + "\n\n\n" + "Conteúdo: " + paginaAtual.getConteudo());
        }
    }

    public void avancar(){
        System.out.println("_____________________________Avançando para próxima página________________________________\n");
        int posicao = historico.indexOf(paginaAtual);
        if (posicao < historico.size() && posicao >= historico.size()-1){
            System.out.println("Não é possível avançar.");
        } else {
            paginaAtual = historico.get(posicao + 1);
            System.out.println("URL: " + paginaAtual.getUrl() + "\n\n\n" + "Conteúdo: " + paginaAtual.getConteudo());
        }
    }


}
