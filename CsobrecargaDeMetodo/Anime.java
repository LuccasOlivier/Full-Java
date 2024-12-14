package CsobrecargaDeMetodo;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Método de inicialização
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //Método igual ao de cima, porem com um parâmetro a mais (sobrecarga de metodos) assinatura diferente.
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    //Método imprimir
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
    }

    // Métodos getter e setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }
}