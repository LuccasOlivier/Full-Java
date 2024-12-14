package M0polimorfismo.model;

public class Tomate extends Produto {
    private String dataValidade;

    //constante para fazer o método calcular imposto
    public static final double IMPOSTO_POR_CENTO = 0.06;

    //Construtor
    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    //Método Calcular produto da classe abstrata Produto (pai) que está definindo implicitamente da inteface Taxavel (logo o método está definido na interface taxavel)
    @Override
    public double calcularImposto(){
        System.out.println("Calculando o imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
}
