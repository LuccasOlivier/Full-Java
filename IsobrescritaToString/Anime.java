package IsobrescritaToString;

public class Anime {
    private String nome;

    // Construtor
    public Anime(String nome) {
        this.nome = nome;
    }

    // Método ToString
    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
