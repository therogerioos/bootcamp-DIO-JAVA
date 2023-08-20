package pastaChamada;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {

    private List<Ligacao> chamadasDiscadas;

    private List<Ligacao> chamadasRecebidas;

    private Ligacao call;


    public AparelhoTelefonico() {
        this.chamadasDiscadas = new ArrayList<>();
        this.chamadasRecebidas = new ArrayList<>();
    }

    public void fazerChamada(String numeroOrigem, String numeroDestino, String duracao) {
        Ligacao chamada = new Ligacao(numeroOrigem, numeroDestino, duracao);
        chamadasDiscadas.add(chamada);
        int posicao = chamadasDiscadas.indexOf(chamada);
        int action = 1;
        display(posicao, action);
        encerrarChamada(posicao, action);

    }

    public void atenderChamada(String numeroOrigem, String numeroDestino, String duracao) {
        Ligacao chamada = new Ligacao(numeroOrigem, numeroDestino, duracao);
        chamadasRecebidas.add(chamada);
        int posicao = chamadasRecebidas.indexOf(chamada);
        int action = 0;
        display(posicao, action);
        encerrarChamada(posicao, action);
    }

    public void display(int posicao, int action) {
        if(action == 1){
            Ligacao Send = chamadasDiscadas.get(posicao);
            System.out.println("\n__________________________________________________Nova Chamada______________________________________________\n");
            System.out.println("\nRealizando chamada do número: " + Send.getNumeroOrigem() + "\nPara: " + Send.getNumeroDestino() + "\n");
        } else if(action == 0) {
            Ligacao Receive = chamadasRecebidas.get(posicao);
            System.out.println("\n________________________________________________Recebendo Chamada___________________________________________\n");
            System.out.println("\nRecebendo chamada do número: " + Receive.getNumeroOrigem() + "\n");
        } else {
            System.out.println("Erro desconhecido");
        }
    }

    public void encerrarChamada(int posicao, int action) {
        if (action == 1){
            Ligacao Send = chamadasDiscadas.get(posicao);
            System.out.println("___________________________________________________Encerrando chamada_________________________________________\n");
            System.out.println("Sua chamada para o número: " + Send.getNumeroDestino() + " foi encerrada." + "\nDuração de: " + Send.getDuracao());
        } else if(action == 0) {
            Ligacao Receive = chamadasRecebidas.get(posicao);
            System.out.println("___________________________________________________Encerrando chamada_________________________________________\n");
            System.out.println("\nA chamada recebida do número: " + Receive.getNumeroOrigem() + " foi encerrada." + "\nDuração de: " + Receive.getDuracao());
        } else {
            System.out.println("Erro desconhecido");
        }
    }

    public List<String> listarChamadasRealizadas() {
        List<String> listCallSend = new ArrayList<>();
        System.out.println("_______________________________________________Listando chamadas realizadas____________________________________\n");
        for(Ligacao call: chamadasDiscadas) {
            String formato = "\nDiscado para: " + call.getNumeroDestino() + "\nDuração: " + call.getDuracao() +"\n";
            listCallSend.add(formato);
        }
        return listCallSend;
    }

    public List<String> listarChamadasRecebidas() {
        List<String> listCallReceive = new ArrayList<>();
        System.out.println("_______________________________________________Listando chamadas recebidas____________________________________\n");
        for(Ligacao call: chamadasRecebidas) {
            String formato = "\nRecebeu chamada de: " + call.getNumeroOrigem() + "\nDuração: " + call.getDuracao() +"\n";
            listCallReceive.add(formato);
        }
        return listCallReceive;
    }

}
