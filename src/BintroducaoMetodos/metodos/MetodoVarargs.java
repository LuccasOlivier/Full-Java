package BintroducaoMetodos.metodos;

public class MetodoVarargs {

    public void somarArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //Vamos fazer o mesmo metodo acima, mas usando o Varargs
    public void varargs(int... numeros){
        int soma = 0;
        for(int num:numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

