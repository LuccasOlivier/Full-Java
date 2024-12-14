/*
   Este programa ilustra o uso básico de expressões regulares em Java utilizando a classe Pattern e Matcher.
   Expressões regulares são uma linguagem para definir padrões em textos. Neste exemplo específico,
   a expressão regular "aba" é utilizada para encontrar todas as ocorrências dessa sequência dentro de uma string.

   No código:
   1. Definimos a expressão regular como "aba".
   2. Criamos duas strings de texto diferentes ("abababa" e "abaaba") para procurar por padrões.
   3. Compilamos a expressão regular em um objeto Pattern usando Pattern.compile(regex).
   4. Criamos um objeto Matcher associando-o a cada texto usando pattern.matcher(texto).
   5. Usamos um loop while com matcher.find() para iterar sobre todas as correspondências encontradas da expressão regular no texto.
      - matcher.start() retorna a posição inicial da correspondência encontrada.

   Resultados esperados na saída:
   Para "abababa":
   texto:   abababa
   indice:  0123456789
   regex: aba
   Posições encontradas
   0 2 4

   Para "abaaba":
   texto:   abaaba
   indice:  01234567
   regex: aba
   Posições encontradas
   0 3
*/

package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba"; // Define a expressão regular que queremos buscar
        String texto1 = "abababa"; // Primeiro texto onde faremos a busca
        String texto2 = "abaaba"; // Segundo texto onde faremos a busca

        // Procura em texto1
        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular em um objeto Pattern
        Matcher matcher = pattern.matcher(texto1); // Cria um Matcher para o texto1

        System.out.println("texto:   " + texto1);
        System.out.println("indice:  0123456789"); // Linha auxiliar para visualizar as posições
        System.out.println("regex: " + regex); // Exibe a expressão regular sendo utilizada
        System.out.println("Posições encontradas");

        // Itera sobre todas as correspondências encontradas da expressão regular no texto1
        while (matcher.find()) {
            System.out.print(matcher.start() + " "); // Imprime a posição inicial da correspondência
        }
        System.out.println("\n");

        // Procura em texto2
        matcher = pattern.matcher(texto2); // Reinicializa o matcher para o novo texto

        System.out.println("texto:   " + texto2);
        System.out.println("indice:  01234567"); // Linha auxiliar para visualizar as posições
        System.out.println("regex: " + regex); // Exibe a expressão regular sendo utilizada
        System.out.println("Posições encontradas");

        // Itera sobre todas as correspondências encontradas da expressão regular no texto2
        while (matcher.find()) {
            System.out.print(matcher.start() + " "); // Imprime a posição inicial da correspondência
        }
    }
}
