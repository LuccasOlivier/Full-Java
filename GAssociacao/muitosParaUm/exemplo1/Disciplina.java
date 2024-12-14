package GAssociacao.muitosParaUm.exemplo1;

//Várias disciplinas podem ter vários Estudantes matriculados. 
public class Disciplina {//Um
    private String nome;

    //Construtor
    public Disciplina(String nome){
        this.nome = nome;
    }

    //Getter e setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
