package GAssociacao.exercicio;

/*
 * Crie um sistema que gerencia seminários 
 * O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
 * Um aluno poderá estar em apenas um seminário 
 * Um seminário poderá ter nenhum ou vários alunos 
 * Um professor poderá ministrar vários seminários
 * Um seminário deve ter um local
 * 
 * Campos básicos (excluindo relacionamento)
 * seminário: titulo
 * aluno: nome e idade
 * professor: nome, especialidade
 * local: endereço
 */
public class Main {
    public static void main(String[] args) {
       Local local = new Local("Rua das Laranjeiras");
       Aluno aluno = new Aluno("Luffy", 17);
       Professor professor = new Professor("Barba branca", "pirata");
       Seminario seminario = new Seminario("Onde achar one piece", new Aluno[]{aluno}, local);
       professor.setSeminarios(new Seminario[] {seminario});

       professor.imprime();
    }
}
