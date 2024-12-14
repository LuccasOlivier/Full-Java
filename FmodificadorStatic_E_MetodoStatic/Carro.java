package FmodificadorStatic_E_MetodoStatic;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    
    //Construtor
    public Carro(String nome, double velocidadeMaxima){
        this.nome= nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Método imprime
    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    //Métodos Getter e Setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Método static
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
    //Metodo static
    public static void setVelocidadeLimite (double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
}