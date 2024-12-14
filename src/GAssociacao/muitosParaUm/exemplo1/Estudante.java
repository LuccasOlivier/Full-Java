package GAssociacao.muitosParaUm.exemplo1;

//Estudante pode estar matriculado em apenas 1 disciplina.

public class Estudante {//Muitos
    private String nome;
    private Disciplina disciplina; // Associação muitos para um

    // Método Construtor
    public Estudante(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // Método construtor com apenas Aluno
    public Estudante(String nome) {
        this.nome = nome;
    }

    // Método imprimir
    public void imprime() {
        //Tratamento caso disciplina seja nulo.
        if (disciplina == null) {
            return;
        }else{
            System.out.println(this.nome + ", está matriculado(a) em: " + disciplina.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
