package M0polimorfismo.model;

public class Computador extends Produto {
    //constante para fazer o método calcular imposto
    public static final double IMPOSTO_POR_CENTO = 0.21;

    //Construtor
    public Computador(String nome, double valor){
        super(nome, valor);
    }
    
    //Método Calcular produto da classe abstrata Produto (pai) que está definindo implicitamente da inteface Taxavel (logo o método está definido na interface taxavel)
    @Override
   public double calcularImposto(){
    System.out.println("Calculando imposto do Computador");
    return this.valor * IMPOSTO_POR_CENTO;
   }
}
