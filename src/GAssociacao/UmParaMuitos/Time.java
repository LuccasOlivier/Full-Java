package GAssociacao.UmParaMuitos;
// Associação unidirecional um para muitos. Vamos usar o nosso exemplo de que 1 jogador só pode fazer parte de 1 time, mas um time pode ter vários jogadores.

//Time não tem conhecimento do jogador.

public class Time {
    private String nomeTime;

    //Construtor
    public Time(String nome){
        this.nomeTime = nome;
    }

    //Getter e setter
    public String GetnomeTime(){
        return nomeTime;
    }

    public void setNome(String nome){
        this.nomeTime = nome;
    }
}
