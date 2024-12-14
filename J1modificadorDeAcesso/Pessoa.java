package J1modificadorDeAcesso;

public class Pessoa {
    private String nome;
    private int idade;


    //Métodos getter e setter
    public String getNome(){
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(int idade) {
        this.idade = idade;
    }
    
    //Método imprimir
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
