package BintroducaoMetodos.metodos;

public class Estudante {
    String nome;
    int idade;
    char sexo;

    public void imprime() {//Fizemos utilização de this
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("-------------");
    }
}