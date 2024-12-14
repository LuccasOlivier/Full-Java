package Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Exemplo de uso da classe DateTimeFormatter em Java.
 * 
 * Este exemplo demonstra como usar a classe DateTimeFormatter para:
 * - Formatar datas e horas em diferentes formatos.
 * - Analisar (converter) strings que representam datas e horas em objetos LocalDate e LocalDateTime.
 * 
 * Formatação (formatter) refere-se ao processo de converter um objeto de data e hora em uma string.
 * Análise (parsing) refere-se ao processo de converter uma string em um objeto de data e hora.
 * 
 * Demonstramos o uso de formatos padrão, personalizados e internacionais para datas e horas.
 */
public class ExemploDateTimeFormatter {
    public static void main(String[] args) {
        // Obtém a data atual
        LocalDate date = LocalDate.now();

        // Formata a data usando formatos padrão
        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        // Imprime a data formatada nos diferentes formatos padrão
        System.out.println("Data formatada com BASIC_ISO_DATE (yyyyMMdd): " + format1);
        System.out.println("Data formatada com ISO_DATE (yyyy-MM-dd): " + format2);
        System.out.println("Data formatada com ISO_LOCAL_DATE (yyyy-MM-dd): " + format3);

        // Analisa (converte) strings em objetos LocalDate usando formatos padrão
        LocalDate parse1 = LocalDate.parse("20240725", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-07-25", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-07-25", DateTimeFormatter.ISO_LOCAL_DATE);

        // Imprime as datas analisadas
        System.out.println("Data analisada com BASIC_ISO_DATE (yyyyMMdd): " + parse1);
        System.out.println("Data analisada com ISO_DATE (yyyy-MM-dd): " + parse2);
        System.out.println("Data analisada com ISO_LOCAL_DATE (yyyy-MM-dd): " + parse3);

        // Obtém a data e hora atual
        LocalDateTime now = LocalDateTime.now();

        // Formata a data e hora atual usando o formato padrão ISO_DATE_TIME
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Data e hora formatada com ISO_DATE_TIME: " + s4);

        // Analisa (converte) uma string em um objeto LocalDateTime usando o formato padrão ISO_DATE_TIME
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-07-25T16:26:45.9336406");
        System.out.println("Data e hora analisada com ISO_DATE_TIME: " + parsedDateTime);

        // Cria um formatador personalizado para o formato de data brasileiro
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String formatterBR = LocalDate.now().format(formatoBR);
        System.out.println("Data formatada com formato brasileiro (dd/MM/yyyy): " + formatterBR);

        // Analisa (converte) uma string no formato brasileiro em um objeto LocalDate
        LocalDate parseBR = LocalDate.parse("25/07/2024", formatoBR);
        System.out.println("Data analisada com formato brasileiro (dd/MM/yyyy): " + parseBR);

        // Cria um formatador personalizado para o formato de data em alemão
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String dataFormatadaGR = LocalDate.now().format(formatterGR);
        System.out.println("Data formatada com formato alemão (dd.MMMM.yyyy): " + dataFormatadaGR);

        // Analisa (converte) uma string no formato alemão em um objeto LocalDate
        LocalDate parseGR = LocalDate.parse("25.Juli.2024", formatterGR);
        System.out.println("Data analisada com formato alemão (dd.MMMM.yyyy): " + parseGR);
    }
}
