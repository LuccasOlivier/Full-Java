package Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

//A classe NumberFormat é abstrata, o que significa que não é possível criar uma instância dela diretamente usando o operador new. Em vez disso, você deve usar os métodos estáticos fornecidos pela classe para obter instâncias de implementações concretas adequadas para o tipo de formatação desejado.

// Exemplo de utilização da classe NumberFormat para formatação de números em diferentes locales.

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // Obtendo a Locale padrão do sistema e outras locales específicas

        Locale localeDefault = Locale.getDefault();// Locale padrão do sistema

        Locale localeBR = new Locale("pt", "BR"); // Locale para Português do Brasil

        Locale localeJP = Locale.JAPAN; // Locale para Japão

        Locale localeIT = Locale.ITALY; // Locale para Itália

        // Criando um array para armazenar diferentes instâncias de NumberFormat para
        // formatação em diferentes locales.
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localeDefault); // Instância para a locale padrão
        nfa[1] = NumberFormat.getInstance(localeJP); // Instância para a locale do Japão
        nfa[2] = NumberFormat.getInstance(localeBR); // Instância para a locale do Brasil
        nfa[3] = NumberFormat.getInstance(localeIT); // Instância para a locale da Itália

        // Valor a ser formatado
        double valor = 10_000.2130;

        // Iterando sobre o array de NumberFormat e formatando o valor
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
