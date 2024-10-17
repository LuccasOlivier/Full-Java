/*
    Esta classe demonstra o uso de metacaracteres em expressões regulares utilizando as classes Pattern e Matcher em Java.
    Cada expressão regular definida aqui tem um significado específico para encontrar padrões diferentes no texto fornecido.

   Descrição das expressões regulares utilizadas:
   - \\d : Corresponde a qualquer dígito (0-9).
   - \\D : Corresponde a qualquer caractere que não seja um dígito.
   - \\s : Corresponde a qualquer espaço em branco, incluindo caracteres como \t, \n, \f e \r.
   - \\S : Corresponde a qualquer caractere que não seja um espaço em branco.
   - \\w : Corresponde a qualquer caractere alfanumérico (letras de a-z, A-Z, dígitos de 0-9 e o caractere _).
   - \\W : Corresponde a qualquer caractere que não seja alfanumérico.
   - [ ] : Define um conjunto de caracteres ou intervalo. Exemplo: [a-c] -> a, b, c. [0-9] -> dígitos.
   - ? : Corresponde a zero ou uma ocorrência do padrão anterior.
   - * : Corresponde a zero ou mais ocorrências do padrão anterior.
   - + : Corresponde a uma ou mais ocorrências do padrão anterior.
   - {n,m} : Corresponde de n até m ocorrências do padrão anterior.
   - ( ) : Define um grupo de padrões e captura o texto correspondente.
   - | : Representa uma alternativa entre padrões. Exemplo: a|b corresponde a 'a' ou 'b'.
   - $ : Corresponde ao final de uma linha ou string.
   - ponto . : 
*/
package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacterPatternTest {
    public static void main(String[] args) {
        // Texto onde faremos a busca
        String texto = "Meu número é 123 e o código do produto é 4567.";

        // Definindo diferentes expressões regulares
        String regex1 = "\\d"; // Encontra todos os dígitos
        String regex2 = "\\D"; // Encontra tudo que não é dígito
        String regex3 = "\\s"; // Encontra todos os espaços em branco
        String regex4 = "\\S"; // Encontra todos os caracteres que não são espaços em branco
        String regex5 = "\\w"; // Encontra todos os caracteres alfanuméricos e o sublinhado (_)
        String regex6 = "\\W"; // Encontra todos os caracteres que não são alfanuméricos

        // Conjunto de caracteres ou intervalo. Exemplo: [a-c]
        String regex7 = "[a-c]"; // Encontra caracteres entre 'a' e 'c'

        // Corresponde a zero ou uma ocorrência do padrão anterior. Exemplo: a?b
        String regex8 = "a?b"; // Encontra 'b' com zero ou um 'a' antes dele

        // Corresponde a zero ou mais ocorrências do padrão anterior. Exemplo: a*b
        String regex9 = "a*b"; // Encontra 'b' com zero ou mais 'a's antes dele

        // Corresponde a uma ou mais ocorrências do padrão anterior. Exemplo: a+b
        String regex10 = "a+b"; // Encontra 'b' com uma ou mais ocorrências de 'a' antes dele

        // Corresponde de n até m ocorrências do padrão anterior. Exemplo: a{2,4}
        String regex11 = "a{2,4}"; // Encontra de 2 a 4 ocorrências de 'a'

        // Define um grupo de padrões e captura o texto correspondente
        String regex12 = "(\\d+)"; // Captura um ou mais dígitos consecutivos

        // Representa uma alternativa entre padrões. Exemplo: a|b
        String regex13 = "a|b"; // Encontra 'a' ou 'b'

        // Corresponde ao final de uma linha ou string
        String regex14 = "\\d+$"; // Encontra uma sequência de dígitos no final da string

        // Corresponde a 'c', seguido por qualquer caractere, seguido por 'd', famoso coringa
        String regex15 = "c.d"; 

        // Testa e imprime os resultados
        System.out.println("Texto para busca: " + texto);

        testRegex(regex1, texto, "\\d : Corresponde a qualquer dígito (0-9).");
        testRegex(regex2, texto, "\\D : Corresponde a qualquer caractere que não seja um dígito.");
        testRegex(regex3, texto, "\\s : Corresponde a qualquer espaço em branco.");
        testRegex(regex4, texto, "\\S : Corresponde a qualquer caractere que não seja um espaço em branco.");
        testRegex(regex5, texto,
                "\\w : Corresponde a qualquer caractere alfanumérico (letras de a-z, A-Z, dígitos de 0-9 e o caractere _).");
        testRegex(regex6, texto, "\\W : Corresponde a qualquer caractere que não seja alfanumérico.");
        testRegex(regex7, texto,
                "[a-c] : Define um conjunto de caracteres ou intervalo. Encontra caracteres entre 'a' e 'c'.");
        testRegex(regex8, "b ab aab", "a?b : Corresponde a zero ou uma ocorrência de 'a' seguido de 'b'.");
        testRegex(regex9, "b ab aab", "a*b : Corresponde a zero ou mais ocorrências de 'a' seguidas de 'b'.");
        testRegex(regex10, "b ab aab", "a+b : Corresponde a uma ou mais ocorrências de 'a' seguidas de 'b'.");
        testRegex(regex11, "a aa aaaa aaaaa", "a{2,4} : Corresponde de 2 a 4 ocorrências de 'a'.");
        testRegex(regex12, texto, "(\\d+) : Captura um ou mais dígitos consecutivos.");
        testRegex(regex13, "a b c", "a|b : Corresponde a 'a' ou 'b'.");
        testRegex(regex14, "12345 6789", "\\d+$ : Corresponde a uma sequência de dígitos no final da string.");
        testRegex(regex15, texto, "c.d : Corresponde a 'c', seguido por qualquer caractere, seguido por 'd'.");
    }

    // Método para testar e imprimir as correspondências encontradas
    private static void testRegex(String regex, String texto, String descricao) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("\n" + descricao);
        while (matcher.find()) {
            System.out.println("Match encontrado: " + matcher.group());
        }
    }
}