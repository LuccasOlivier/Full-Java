package Hheranca;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();

        endereco1.setRua("Rua 3");
        endereco1.setCep("03967060");
        

        Pessoa pessoa = new Pessoa("Lucas");

        pessoa.setCpf("44282832565");
        pessoa.setEndereco(endereco1);

        Funcionario funcionario = new Funcionario("João");
        endereco2.setRua("Rua do gato");
        endereco2.setCep("03969090");
        
        funcionario.setCpf("5585858585");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(2500);
        

        pessoa.imprime();
        System.out.println("----------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
