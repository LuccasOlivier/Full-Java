public class ContaBancaria {
    private static int contador = 0;
    //A variável contador precisa ser static porque seu valor deve ser consistente e compartilhado entre todas as instâncias da classe ContaBancaria. Isso permite que cada nova conta criada incremente um contador global que rastreia o número total de contas criadas até o momento.
    private int numeroConta;

    // Bloco de inicialização de instância

    {
        contador++;
        numeroConta = contador;
        System.out.println("Conta: " + numeroConta + " criada.");
    }

    //construtores da classe
    public ContaBancaria(){
        System.out.println("Construtor padrão executado.");
    }

    public ContaBancaria(double saldoInicial){
        System.out.println("Construtor com saldo inicial executado. Saldo: " + saldoInicial);

    }
}