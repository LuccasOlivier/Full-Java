package EblocosDeInicializacao.estaticos;

public class ContaBancaria {
    private static int contador;
    private int numeroConta;

    static{
        contador = 1000; //Valor inicial para contador
        System.out.println("Bloco de inicialização static executado. Contador incial: " + contador);
    }

    //Bloco de inicialização de instância
    {
        contador++;
        numeroConta = contador;
        System.out.println("Conta: " + numeroConta + " criada.");
    }

    //Construtor da classe
    public ContaBancaria(){
        System.out.println("Construtor padrão executado.");
    }

    public ContaBancaria(double saldo){
        System.out.println("Construtor com saldo inicial executado. Saldo: " + saldo);
    }

    //Método get para obeter o número da conta
    public int getNumeroConta(){
        return numeroConta;
    }
}
