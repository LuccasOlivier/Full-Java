package GAssociacao.muitosParaUm.exemplo2;
// contexto deste exemplo, "muitos" se refere aos objetos da classe Professor e "um" se refere ao objeto da classe Escola.
//Esse professor só pode trabalhar em uma escola.

public class Professor {
    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
