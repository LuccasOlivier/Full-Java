package Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Esta classe demonstra o uso de alguns métodos da classe utilitária TemporalAdjusters da API de Data e Hora do Java.
 * TemporalAdjusters fornece métodos estáticos para criar ajustadores temporais comuns para LocalDate.
 * Exemplos incluem encontrar o último dia do mês, o próximo dia de uma determinada DayOfWeek, e outros ajustes úteis para datas.
 */
public class TemporalAdjustersTest01 {

    public static void main(String[] args) {
        // Obtendo a data atual
        LocalDate now = LocalDate.now();

        // Encontrando o último dia do mês para a data atual
        LocalDate ultimoDiaMes = now.with(TemporalAdjusters.lastDayOfMonth());

        // Encontrando a próxima sexta-feira após a data atual
        LocalDate proximaSexta = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        // Encontrando o último dia do ano para a data atual
        LocalDate ultimoDiaAno = now.with(TemporalAdjusters.lastDayOfYear());

        // Encontrando o próximo dia 15 do mês após a data atual
        LocalDate proxDiaQuinze = now.with(TemporalAdjusters.firstDayOfNextMonth()).withDayOfMonth(15);

        // Imprimindo os resultados
        System.out.println("Último dia do mês: " + ultimoDiaMes);
        System.out.println("Próxima Sexta-feira: " + proximaSexta);
        System.out.println("Último dia do ano: " + ultimoDiaAno);
        System.out.println("Próximo dia 15 do mês: " + proxDiaQuinze);
    }
}
