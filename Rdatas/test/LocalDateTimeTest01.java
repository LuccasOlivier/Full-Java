package Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Esta classe demonstra o uso da classe LocalDateTime do pacote java.time para manipulação de data e hora.
 * Também são mostrados exemplos utilizando LocalDate e LocalTime como complemento para criação de LocalDateTime.
 */

public class LocalDateTimeTest01{
    public static void main(String[] args){
   // Obtendo a data e hora atual do sistema operacional
   LocalDateTime localDateTime = LocalDateTime.now();
   System.out.println("Data e Hora Atual: " + localDateTime);

   // Parsing de uma data específica usando LocalDate
   LocalDate date = LocalDate.parse("2022-08-06");
   System.out.println("Data Parseada: " + date);

   // Parsing de uma hora específica usando LocalTime
   LocalTime time = LocalTime.parse("14:35:00");
   System.out.println("Hora Parseada: " + time);

   // Criando LocalDateTime combinando LocalDate com LocalTime
   LocalDateTime ldt1 = date.atTime(time);
   System.out.println("LocalDateTime combinado usando atTime(): " + ldt1);

   // Criando LocalDateTime usando valores específicos de hora
   LocalDateTime ldt2 = date.atTime(12, 10, 0);
   System.out.println("LocalDateTime combinado com valores de hora: " + ldt2);

   // Criando LocalDateTime combinando LocalTime com LocalDate
   LocalDateTime ldt3 = time.atDate(date);
   System.out.println("LocalDateTime combinado usando atDate(): " + ldt3);
    }
}
