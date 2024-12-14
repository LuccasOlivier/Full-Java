package M0polimorfismo.test;

import M0polimorfismo.model.Computador;
import M0polimorfismo.model.Produto;
import M0polimorfismo.model.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        //Temos aqui um exemplo de widening cast (mais amplo). Conversão automática do mais especifico(menor precisão) para o mais genéric(maior precisão) (da direita p/ esquerda)
        Produto produto1 = new Computador("Computador Ryzen 9", 3000);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("-------------------");

        Produto produto2  = new Tomate("Tomate Americano",20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
                
    }  
}
