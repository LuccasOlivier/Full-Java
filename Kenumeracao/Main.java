package Kenumeracao;

public class Main {
    public static void main(String[] args){
        //Suponhamos que temos que criar um sistema que receba o nome do Cliente, mas o tipo do cliente e o tipo de pagamento devem ser consistentes, seguindo um padrão:

        Cliente cliente1 = new Cliente("Lucas",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.CalcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.CalcularDesconto(100));
    }
}
