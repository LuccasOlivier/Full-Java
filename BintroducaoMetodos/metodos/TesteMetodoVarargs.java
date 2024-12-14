package BintroducaoMetodos.metodos;

public class TesteMetodoVarargs {
    public static void main(String[] args) {
        MetodoVarargs metodovarargs = new MetodoVarargs();

        //Sem o método Varargs é necessário criar um array explicitamente antes de passar os valores para o método.
        int[] numeros = {1,2,3,4,5};
        metodovarargs.somarArray(numeros);

        // Com Varargs permite passar os valores diretamente, sem a necessidade de criar um array explicitamente, tornando o código mais flexível e fácil de usar.
        metodovarargs.varargs(1,2,3,4,5,6,7,8,9,10);
        metodovarargs.varargs(numeros); // Isso também funciona, mas a vantagem maior é da forma que fizemos acima.

    }
}
