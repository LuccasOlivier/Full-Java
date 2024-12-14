package BintroducaoMetodos.metodos.Exercicios;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    // Método para imprimir os dados
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            System.out.println("-----------------");
            System.out.println("Últimos 3 salários: ");
            for (double salario : salarios) {
                System.out.print(salario + " | ");
            }
            System.out.println("\n-----------------");
        }
    }

    // Método para calcular e imprimir a média salarial
    public void mediaSalario() {
        if (salarios == null) {
            System.out.println("Salários não informados.");
            return;
        }

        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.println("Média salarial: " + media);
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}