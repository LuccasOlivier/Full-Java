package BintroducaoMetodos.metodos;

public class Calculadora {
    //Aqui criamos um método void (vazio), ou seja, sem retorno.
    public void somarDoisNumeros(){
        System.out.println(10+10);

    }
    // Criando um método com parâmetros
    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a * b);
    }

    //Criando um método com retorno

    public double dividir(double a, double b){
        return a / b;
    }
}