package J2modificadorFinal;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador: " + nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
