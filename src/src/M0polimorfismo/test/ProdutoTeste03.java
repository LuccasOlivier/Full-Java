package M0polimorfismo.test;

import M0polimorfismo.model.Computador;
import M0polimorfismo.model.Produto;
import M0polimorfismo.model.Tomate;
import M0polimorfismo.service.CalcularaImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        
        Produto produto = new Computador("Ryzen 9", 3000);
        
        Tomate tomate = new Tomate("Tomate Americano", 20); 
        tomate.setDataValidade("Data de validade: 11/12/2021");
        
        CalcularaImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalcularaImposto.calcularImposto(produto);
    }
}
