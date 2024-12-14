package Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
A classe Duration em Java é fundamental quando se precisa calcular e manipular intervalos de tempo precisos entre dois instantes, como horas, minutos, segundos e nanossegundos. Ela é especialmente útil em situações onde você precisa determinar o tempo decorrido entre eventos, realizar cálculos de tempo ou simplesmente medir a duração de uma atividade. No entanto, ela não é apropriada para lidar diretamente com datas sem um componente de tempo, como LocalDate, que representa apenas uma data sem informações de hora do dia.*/

public class DurationTest01 {
    public static void main(String[] args) {
        // Obtendo o LocalDateTime atual
        LocalDateTime now = LocalDateTime.now();

        // Obtendo o LocalDateTime daqui a 2 anos e 8 minutos a partir de agora
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

        // Obtendo o LocalTime atual
        LocalTime timeNow = LocalTime.now();

        // Obtendo o LocalTime 7 horas atrás a partir de agora
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        
        //A classe Duration não possui um método now() como outras classes de data e hora (LocalDateTime, LocalDate, etc.). Em vez disso, você precisa especificar explicitamente a quantidade de tempo que deseja representar ao criar uma instância de Duration. Ela é projetada para lidar com intervalos de tempo específicos em termos de segundos e nanossegundos, e não para capturar o tempo atual instantaneamente.
        
        // Calculando a diferença de tempo entre dois LocalDateTime
        Duration d1 = Duration.between(now,nowAfterTwoYears);

        // Calculando a diferença de tempo entre dois LocalTime
        Duration d2 = Duration.between(timeNow,timeMinus7Hours);

        // Calculando a duração de 1000 segundos a partir de Instant.now()
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));

        // Imprimindo as durações calculadas
        System.out.println("Duração entre now e nowAfterTwoYears: " + d1);
        System.out.println("Duração entre timeNow e timeMinus7Hours: " + d2);
        System.out.println("Duração de 1000 segundos a partir de agora: " + d3);
    }
}
