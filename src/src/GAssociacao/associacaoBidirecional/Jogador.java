package GAssociacao.associacaoBidirecional;

//Associação unidirecional um para muitos.

//Jogador tem conhecimento do time

public class Jogador {
    //Titulo da aula: Associação - Arrays com Objetos
    private String nome;

    //Abaixo demonstro que um jogador pode fazer parte apenas de 1 time. Variável time do tipo Time.
    private Time time;

    //Construtor
    public Jogador(String nome){
        this.nome = nome;
    }

    //Método imprime
    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNomeTime());
        }
    }

    //Getter e setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }
}
