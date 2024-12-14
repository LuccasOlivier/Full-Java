package GAssociacao.muitosParaUm.exemplo2;
//contexto deste exemplo, "muitos" se refere aos objetos da classe Professor e "um" se refere ao objeto da classe Escola.

//Uma escola tem vários professores

public class Escola {
    private String nome;
    private Professor[] professores; //Array de vários professores


    //Construtor1
    public Escola(String nome){
        this.nome = nome;
    }

    //Construtor2
    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    //Método imprime
    public void imprime(){
        System.out.println("Nome da escola: "+this.nome);
        if(professores == null){
            return;
        }else{
            System.out.println("Professores: ");
            for(Professor professor : professores){
                System.out.println(professor.getNome());
            }
        }
    }

    //Getter e setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
