package GAssociacao.associacaoBidirecional;
// Associação unidirecional um para muitos. Vamos usar o nosso exemplo de que 1 jogador só pode fazer parte de 1 time, mas um time pode ter vários jogadores.

//Time não tem conhecimento do jogador.

public class Time {
    private String nomeTime;
    private Jogador[] jogadores;

    //Construtor
    public Time(String nome){
        this.nomeTime = nome;
    }

    public Time(String nomeTime, Jogador[] jogadores){
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
    }

    //Método imprimir
    public void imprime(){
        System.out.println(this.nomeTime);
        if(jogadores == null){
            return;
        }else{
            for(Jogador jogador : jogadores){
                System.out.println(jogador.getNome());
            }
        }
    }

    //Getter e setter
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
