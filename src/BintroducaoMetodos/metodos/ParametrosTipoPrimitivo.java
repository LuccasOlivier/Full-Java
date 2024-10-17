package BintroducaoMetodos.metodos;

public class ParametrosTipoPrimitivo {
    public static void main (String[] args){
        int numero = 5;

        System.out.println("Antes de chamar o método: " + numero);
        incrementar(numero);
        System.out.println("Depois de chamar o método: " + numero);
    }

    public static void incrementar(int valor){
        valor++;
        System.out.println("Dentro do método: " + valor);
    }
}
