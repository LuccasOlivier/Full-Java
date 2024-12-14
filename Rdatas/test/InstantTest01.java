package Rdatas.test;

import java.time.Instant;

/*
    A classe utilitária Instant em Java representa um ponto específico no tempo, geralmente definido como a quantidade de *segundos* decorridos desde o Epoch Unix (01 de janeiro de 1970, 00:00:00 UTC). Ela representa um instante único e preciso no tempo, medida em *nanossegundos* a partir do Epoch Unix. No contexto da classe Instant em Java, o "Z" na representação do tempo indica que o instante está sendo exibido no formato UTC (Tempo Universal Coordenado). Neste caso, o "Z" indica que o tempo especificado (15:45:30.123456789Z) está sendo exibido no formato UTC. Ou seja, o instante representado é equivalente ao tempo universal coordenado, independentemente do fuso horário em que o código está sendo executado.
 */
public class InstantTest01 {
    public static void main (String[] args){
        //Obtendo o instante atual do sistema
        Instant now = Instant.now();
        System.out.println("Instante atual: "+now);

        //Exemplo de criação de um Instant específico (10 segundos após o Epoch Unix)
        Instant specificInstant = Instant.ofEpochSecond(10);
        System.out.println("Instant específico: " + specificInstant);

        //Exemplo de adição de duração a um Instant
        Instant futureInstant = now.plusSeconds(60);
        System.out.println("Instant futuro: " + futureInstant);

        //Comparando Instants
        if (futureInstant.isAfter(now)){
            System.out.println("O Instant futuro é posterior ao Instant atual");
        }
    }
}
