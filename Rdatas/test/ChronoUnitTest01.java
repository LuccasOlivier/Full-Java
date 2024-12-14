package Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Exemplo de utilização da classe utilitária ChronoUnit para calcular diferenças de tempo.
 */
public class ChronoUnitTest01 {

    public static void main(String[] args) {
        // Definindo a data de nascimento
        LocalDateTime nascimento = LocalDateTime.of(1995, 1, 9, 12, 0, 0);

        // Obtendo a data e hora atuais
        LocalDateTime now = LocalDateTime.now();

        // Calculando a diferença em dias desde o nascimento até a data atual
        System.out.println("Dias desde o nascimento: " + ChronoUnit.DAYS.between(nascimento, now));

        // Calculando a diferença em semanas desde o nascimento até a data atual
        System.out.println("Semanas desde o nascimento: " + ChronoUnit.WEEKS.between(nascimento, now));

        // Calculando a diferença em meses desde o nascimento até a data atual
        System.out.println("Meses desde o nascimento: " + ChronoUnit.MONTHS.between(nascimento, now));

        // Calculando a diferença em anos desde o nascimento até a data atual
        System.out.println("Anos desde o nascimento: " + ChronoUnit.YEARS.between(nascimento, now));
    }
}
