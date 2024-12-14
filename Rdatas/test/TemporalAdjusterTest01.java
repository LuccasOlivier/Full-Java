package Rdatas.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Exemplo de utilização do TemporalAdjuster em Java.
 * Este programa demonstra como utilizar o TemporalAdjuster para obter o
 * primeiro dia
 * do próximo mês a partir da data atual.
 */

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        // Obtém a data atual
        LocalDate now = LocalDate.now();

        // Usa o TemporalAdjuster TemporalAdjusters.firstDayOfNextMonth() para obter o
        // primeiro dia do próximo mês
        LocalDate primeiroDiaProximoMes = now.with(TemporalAdjusters.firstDayOfNextMonth());

        // Imprime o resultado
        System.out.println("Primeiro dia do próximo mês: " + primeiroDiaProximoMes);

        // Exemplo adicional: ajustando para o último dia do mês atual
        LocalDate ultimoDiaMesAtual = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês atual: " + ultimoDiaMesAtual);

        // Exemplo adicional: ajustando para o primeiro dia do ano seguinte
        LocalDate primeiroDiaAnoSeguinte = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro dia do ano seguinte: " + primeiroDiaAnoSeguinte);
    }
}
