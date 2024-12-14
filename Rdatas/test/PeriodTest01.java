package Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Demonstração do uso da classe Period em Java.
 * 
 * A classe Period é usada para representar um período de tempo baseado em anos,
 * meses e dias. Ela é útil para calcular diferenças de tempo entre datas e
 * para criar períodos específicos de dias, semanas, meses ou anos.
 */
public class PeriodTest01 {
    public static void main(String[] args) {
        // Obtendo a data atual
        LocalDate now = LocalDate.now();
        
        // Obtendo a data daqui a 2 anos e 7 dias a partir de agora
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        
        // Calculando o período entre duas datas
        Period p1 = Period.between(now, nowAfterTwoYears);
        
        // Criando um período de 10 dias
        Period p2 = Period.ofDays(10);
        
        // Criando um período de 58 semanas
        Period p3 = Period.ofWeeks(58);
        
        // Criando um período de 3 meses
        Period p4 = Period.ofMonths(3);
        
        // Criando um período de 3 anos
        Period p5 = Period.ofYears(3);
       
        // Imprimindo os períodos calculados
        System.out.println("Período entre now e nowAfterTwoYears: " + p1);
        System.out.println("Período de 10 dias: " + p2);
        System.out.println("Período de 58 semanas: " + p3);
        System.out.println("Período de 3 meses: " + p4);
        System.out.println("Período de 3 anos: " + p5);
    }
}
