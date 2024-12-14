package Oexception.BexceptionUnchecked.test;

/*
 *  Exemplos de exceções não verificadas (unchecked exceptions) especificamente RuntimeException
 */
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(10, 0);
    }

    /**
     * Realiza a divisão de dois números inteiros.
     * 
     * @param a O dividendo
     * @param b O divisor (não pode ser zero)
     * @return O resultado da divisão de a por b
     * @throws IllegalArgumentException Se b for zero
     */
    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, divisão por zero não é válido.");
        }
        int resultado = a / b;
        System.out.println("Resultado da divisão: " + resultado);
        return resultado;
    }
}
