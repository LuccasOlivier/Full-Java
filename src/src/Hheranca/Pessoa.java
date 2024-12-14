package Hheranca;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco 1 de inicialização não estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco 2 de inicialização não estático de Pessoa");
    }

    //Construtor
    public Pessoa(String nome){
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }
   
    // Método imprime
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + "CEP: " + this.endereco.getCep());
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
