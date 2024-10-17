package Uregex.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * A classe `RegexPatternMatcherRange` demonstra o uso de expressões regulares (regex)
 * para encontrar padrões específicos em uma string. O exemplo inclui dois casos principais:
 *
 * 1. **Intervalo de Caracteres**: Utiliza uma expressão regular para encontrar caracteres que pertencem a um intervalo específico, como dígitos numéricos.
 * 2. **Intervalo de Comprimento**: Utiliza uma expressão regular para encontrar sequências de caracteres (neste caso, dígitos) que possuem um comprimento variado dentro de um intervalo.
 *
 * **Detalhes dos Exemplos**:
 *
 * - **Exemplo 1**: Busca por qualquer dígito (0-9) em uma string. O padrão `[0-9]` é usado para encontrar todos os caracteres que são dígitos.
 *
 * - **Exemplo 2**: Busca por sequências de dígitos com comprimento entre 2 e 5 em uma string.
 *   O padrão `\\d{2,5}` é usado para encontrar grupos de dígitos que têm pelo menos 2 e no máximo 5 dígitos.
 */
public class RegexPatternMatcherRange {
    public static void main(String[] args) {
        // Exemplo 1: Intervalo de caracteres
        String text1 = "A1b2C3d4E5";
        String pattern1 = "[0-9]"; //Padrão para encontrar qualquer digito de 0 a 9

        // Cria um padrão e um matcher para o texto1
        Pattern compilePattern1 = Pattern.compile(pattern1);
        Matcher matcher1 = compilePattern1.matcher(text1);

        System.out.println("Exemplo 1: Intervalo de Caracteres");
        // Verifica e imprime todas as correspondências no texto1
        while (matcher1.find()){
            System.out.println("Match found: "+matcher1.group());
        }

          // Exemplo 2: Intervalo de Comprimento
          String text2 = "123456 78 9";
          String pattern2 = "\\d{2,5}";// Padrão para encontrar sequências de 2 a 5 dígitos

          // Cria um padrão e um matcher para o texto2
          Pattern compilePattern2 = Pattern.compile(pattern2);
          Matcher matcher2 = compilePattern2.matcher(text2);

          System.out.println("\nExemplo 2: Intervalo de Comprimento");
          // Verifica e imprime todas as correspondências no texto2
          while (matcher2.find()){
                System.out.println("Match found: " + matcher2.group());
          }
    }
}
