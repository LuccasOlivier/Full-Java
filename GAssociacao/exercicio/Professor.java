package GAssociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    // Primeiro Construtor
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Sobrecarga de Construtor
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    //
    public void imprime() {
        System.out.println("----------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) {
            return;
        } else {
            System.out.println("## Seminários cadastrados ##");
            for (Seminario seminario : this.seminarios) {
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereco());
                if (seminario.getAlunos() == null || seminario.getAlunos().length == 0){
                    continue;
                }
                System.out.println("** Alunos **");
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.println("Aluno: " + aluno.getNome() + ". Idade: " + aluno.getIdade());
                }
            }
        }

    }

    // Getter Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
