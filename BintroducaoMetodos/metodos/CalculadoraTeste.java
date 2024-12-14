package BintroducaoMetodos.metodos;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros();

        calculadora.multiplicaDoisNumeros(10, 3);
        
        //Como o metodo dividir retorna um valor, não existe nenhum print nele, sendo assim, se não colocarmos ele dentro de uma outra variavel mandarmos imprimir essa variável, nao vamos conseguir enxergar nada. Ou podemos simplesmente imprimir o metodo diretamente dessa forma:
        System.out.println(calculadora.dividir(50, 0));
    }
}
