package Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Demonstração do uso das classes ZonedDateTime, ZoneId e OffsetDateTime em Java.
 * 
 * Esta classe Java apresenta exemplos simples e claros de como utilizar as classes
 * utilitárias do pacote java.time para manipulação de datas, horas e fusos horários.
 * Cada exemplo é acompanhado de comentários explicativos que detalham o funcionamento
 * de operações como conversão de LocalDateTime para ZonedDateTime, obtenção de informações
 * sobre ZoneId específicos e criação de OffsetDateTime com deslocamentos fixos.
 */

public class ZonedDateTimeZoneIdOffsetDateTime {
    public static void main(String[] args) {
        // Obtém a data e hora local atual
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Data e hora local atual: " + now);

        // Define o ZoneId para Tóquio
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); 

        // Converte para ZonedDateTime com o ZoneId de Tóquio
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println("Data e hora em Tóquio: " + zonedDateTime);

        //OffsetDateTime
        // Cria um OffsetDateTime com um deslocamento específico (Manaus, -04:00)
        ZoneOffset offSetManaus = ZoneOffset.of("-04:00"); // Define o deslocamento para Manaus, -04:00

        // Obtém o Instant atual (timestamp em UTC)
        Instant nowInstant = Instant.now();
        System.out.println("Instante atual em UTC: " + nowInstant);

        // Converte Instant para ZonedDateTime com o deslocamento de Manaus
        ZonedDateTime zonedDateTimeManaus = nowInstant.atZone(offSetManaus);
        System.out.println("Data e hora em Manaus: " + zonedDateTimeManaus);
    }
}
