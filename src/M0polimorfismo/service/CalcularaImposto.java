package M0polimorfismo.service;

import M0polimorfismo.model.Produto;
import M0polimorfismo.model.Tomate;

public class CalcularaImposto {

    // Método calcular imposto utilizando parâmetro polimórfico
    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        if (produto instanceof Tomate) {
            // Verifica se o objeto referenciado por 'produto' é uma instância de Tomate. Se for verdadeiro, fazemos um narrowing cast (conversão de tipo) para Tomate,permitindo assim acessar métodos específicos de Tomate que não estão disponíveis diretamente na classe Produto.
            Tomate tomate = (Tomate) produto; // Narrowing cast
            System.out.println(tomate.getDataValidade());
        }
    }

    /*
     * Fizemos um narrowing cast, devido a necessidade de Acesso a Métodos
     * Específicos: Precisamos acessar métodos ou atributos específicos da classe
     * Tomate que não estão presentes na classe Produto. No exemplo, usamos
     * tomate.getDataValidade() para obter a data de validade do tomate. Sem isso, não conseguiríamos obter esse valor específico de tomate.
     */
}
