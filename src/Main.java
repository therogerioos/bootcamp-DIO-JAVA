// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import pastaChamada.AparelhoTelefonico;
import pastaInternet.NavegadorInternet;
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

        System.out.println(reprodutor.getListaDeMusicas());
        reprodutor.musicaTocando(reprodutor.getMusicaEscolhida());
        System.out.println("Selecionando música.....");
        reprodutor.getMusicaAtual();
        reprodutor.getReproduzir();
        reprodutor.musicaAnterior(reprodutor.getMusicaEscolhida());
        reprodutor.getMusicaAtual();
        reprodutor.musicaProxima(reprodutor.getMusicaEscolhida());
        reprodutor.getMusicaAtual();
        reprodutor.getPausando();
        reprodutor.removerMusica(3);

        System.out.println(reprodutor.getListaDeMusicas());

        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.atenderChamada("31925475245","11985246954", "00:11:15" );
        telefone.fazerChamada("11985246954","21954625896", "00:30:51" );
        telefone.fazerChamada("11985246954","31925475245", "00:10:01" );
        telefone.atenderChamada("21954625896","11985246954", "00:03:25" );

        System.out.println(telefone.listarChamadasRealizadas());

        System.out.println(telefone.listarChamadasRecebidas());

        NavegadorInternet navega = new NavegadorInternet();

        navega.abrirPagina("www.therogerioos.com.br/portfolio","\nOlá, este espaço é destinado a mostrar todas as minhas habilidades\n");
        navega.abrirPagina("www.therogerioos.com.br/tutoriais","\nEste espaço é destinado para ajudar com dicas de programação\n");
        navega.voltar();
        navega.avancar();
        navega.abrirPagina("www.therogerioos.com.br/curriculo", "\nVersão WEB do meu curriculo\n");
        navega.abrirPagina("www.therogerioos.com.br/sobremim", "\nSaiba sobre minha carreira e meus projetos\n");


    }
}