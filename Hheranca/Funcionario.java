package Hheranca;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático do Funcionário");
    }

    {
        System.out.println("Dentro do bloco 1 de inicialização não estático do Funcionário");
    }

    {
        System.out.println("Dentro do bloco 2 de inicialização não estático do Funcionário");
    }

    //Construtor da classe pai (Pessoa).
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor do Funcionário");
    }

    // Método imprime, sobrescrito da superclasse Pessoa
    @Override
    public void imprime() {
        System.out.println("### Dados do funcionário ###");
        super.imprime();// Chamando o método da pessoa, e abaixo acrescentando mais uma informação.
        System.out.println("Salário: " + this.salario);
    }

    //Deixei os atributos da pessoa protected, a fim de ter acesso p/ fazer isso:
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
