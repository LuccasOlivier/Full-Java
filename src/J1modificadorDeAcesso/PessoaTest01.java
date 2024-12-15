package J1modificadorDeAcesso;

public class PessoaTest01 {
    public static void main (String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Lucas");
        pessoa1.setNome(30);

        pessoa1.imprimir();
    }
}
