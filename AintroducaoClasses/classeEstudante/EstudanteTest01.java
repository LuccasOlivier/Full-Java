package classeEstudante;

public class EstudanteTest01 {
    public static void main (String[] args){
        
        ClasseEstudante estudante = new ClasseEstudante();

        estudante.nome = "Lucas";
        estudante.idade = 29;
        estudante.sexo = 'M';

        System.out.println("Nome do estudante: "+ estudante.nome + ". Idade: " + estudante.idade + ". Sexo: " + estudante.sexo);
    }
}
