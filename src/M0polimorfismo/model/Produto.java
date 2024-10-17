package M0polimorfismo.model;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    //Construtor
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    //Método getter
    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }
}