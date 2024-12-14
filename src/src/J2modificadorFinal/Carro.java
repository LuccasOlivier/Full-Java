package J2modificadorFinal;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //Constante precisa ter nome maiúsculo e se for mais de 1 nome, é preciso separar por underline. Ao declarar uma constante como static, ela se torna acessível a partir de qualquer parte do código que tenha acesso à classe que a contém. Isso é útil quando você deseja que a constante seja globalmente visível e utilizável em todo o projeto.

    /*
     * OBS:  Como a constante é declarada como static, ela pertence à classe em vez de pertencer a instâncias individuais da classe. Isso significa que não é necessário criar uma instância da classe para acessar a constante. Isso é especialmente útil para variáveis que não precisam ser associadas a instâncias específicas da classe.
     * 
     * Portanto, ao declarar uma constante em Java, especialmente quando você quer que ela seja compartilhada globalmente e não precise de uma instância específica da classe, é uma prática comum acompanhá-la com o modificador static.
     */

    // A referência que a variável (COMPRADOR) tem para o objeto > new comprador(), nunca poderá ser alterada.
    public final Comprador COMPRADOR = new Comprador();

     //Getter e Setter para o nome, pois velocidade_limite já é público
     public String getNome(){
        return nome;
     }

     public void setNome(String nome){
        this.nome = nome;
     }
}
