package M0polimorfismo.test;

import M0polimorfismo.model.Computador;
import M0polimorfismo.model.Televisao;
import M0polimorfismo.model.Tomate;
import M0polimorfismo.service.CalcularaImposto;


public class ProdutoTest01 {
    public static void main(String[] args) {
       Computador computador = new Computador("NUC10i7", 11000);
       Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);

       CalcularaImposto.calcularImposto(computador);
       System.out.println("------------------------");
       CalcularaImposto.calcularImposto(tomate);
       System.out.println("------------------------");
       CalcularaImposto.calcularImposto(televisao);

        /*Deixamos os métodos estáticos, assim calcularImpostoComputador e calcularImpostoTomate podem ser chamados diretamente através do nome da classe (CalcularImposto) sem precisar criar uma instância dessa classe. Isso facilita o uso, pois não é necessário instanciar CalcularImposto para utilizá-los. Lembre-se: Quando um método é declarado como static em uma classe Java, ele pertence à classe em si e não a instâncias individuais dessa classe. */
    }
}
