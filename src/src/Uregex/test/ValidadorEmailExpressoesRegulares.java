package Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A classe `ValidadorEmailExpressoesRegulares` demonstra como validar endereços de e-mail
 * utilizando expressões regulares em Java. O objetivo é verificar se um
 * endereço de e-mail está no formato correto, de acordo com um padrão
 * simplificado de expressão regular.
 *
 * Descrição do padrão de expressão regular usado:
 * - ^ : Início da string.
 * - [a-zA-Z0-9._%+-]+ : Um ou mais caracteres alfanuméricos, pontos (.), sublinhados (_),
 *   percentuais (%), sinais de adição (+) e sinais de menos (-) antes do símbolo @.
 * - @ : O símbolo @ que separa a parte local do domínio.
 * - [a-zA-Z0-9.-]+ : Um ou mais caracteres alfanuméricos, pontos (.), ou sinais de menos (-)
 *   no domínio.
 * - \\. : Um ponto literal (.) que precede a parte do domínio de nível superior.
 * - [a-zA-Z]{2,} : Pelo menos dois caracteres alfabéticos para a parte do domínio de nível
 *   superior (por exemplo, com, org, net).
 * - $ : Fim da string.
 *
 * Exemplo de e-mails válidos e inválidos são fornecidos e verificados pelo método
 * `isValidEmail`, que utiliza o padrão de expressão regular para determinar a validade.
 */
public class ValidadorEmailExpressoesRegulares {
    public static void main(String[] args) {
        // Lista de e-mails para validar
        String[] emails = {
            "teste@exemplo.com", // Válido
            "usuario.nome@dominio.co", // Válido
            "usuario@dominio.com.br", // Válido
            "user@sub.dominio.com", // Válido
            "usuario@dominio", // Inválido: Falta o domínio de nível superior
            "user@.com", // Inválido: O domínio não pode começar com um ponto
            "user@dominio.c", // Inválido: O TLD deve ter pelo menos dois caracteres
            "@dominio.com", // Inválido: Falta a parte local do e-mail
            "user@dominio.corporate", // Inválido: O TLD deve ser de dois a seis caracteres
            "user@dominio..com" // Inválido: Domínio não pode ter dois pontos consecutivos
        };
        
        // Expressão regular para validação de e-mails
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        // Testa cada e-mail na lista e imprime se é válido ou inválido
        System.out.println("Validação de E-mails:");
        for (String email : emails) {
            boolean isValid = isValidEmail(email, emailRegex);
            System.out.println(email + " : " + (isValid ? "Válido" : "Inválido"));
        }
    }
    
    /**
     * Método para validar e-mails usando a expressão regular fornecida.
     * 
     * @param email O endereço de e-mail a ser validado.
     * @param regex O padrão de expressão regular para validação.
     * @return true se o e-mail corresponder ao padrão, caso contrário, false.
     */
    private static boolean isValidEmail(String email, String regex) {
        Pattern pattern = Pattern.compile(regex); // Compila o padrão da expressão regular
        Matcher matcher = pattern.matcher(email); // Cria um matcher para o e-mail
        return matcher.matches(); // Retorna true se o e-mail corresponder ao padrão
    }
}
