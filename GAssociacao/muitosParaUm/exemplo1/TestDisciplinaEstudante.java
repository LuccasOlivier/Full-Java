package GAssociacao.muitosParaUm.exemplo1;

public class TestDisciplinaEstudante {
    public static void main(String[] args) {
        
        Disciplina disciplina1 = new Disciplina("Biologia.");
        Disciplina disciplina2 = new Disciplina("ADS.");

        Estudante estudante = new Estudante("Pedro", disciplina2);
        Estudante estudante1 = new Estudante("Lyvia", disciplina1);
        Estudante estudante2 = new Estudante("Lucas", disciplina2);
        
 

        estudante.imprime();
        estudante1.imprime();
        estudante2.imprime();

        //temos uma associação muitos-para-um, onde muitos estudantes estão associados a uma única disciplina. Cada estudante está matriculado em apenas uma disciplina, mas as disciplinas podem ter vários estudantes matriculados.
    }
}
