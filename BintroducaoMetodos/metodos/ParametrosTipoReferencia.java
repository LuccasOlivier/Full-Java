package BintroducaoMetodos.metodos;

public class ParametrosTipoReferencia {
    public static void main (String[] args){
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante1.nome = "Midoriya";
        estudante1.idade = 15; 
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16; 
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
        
    }
}
