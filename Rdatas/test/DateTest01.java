package Rdatas.test;

import java.util.Date;

/*Em Java, as classes utilitárias relacionadas a datas são comumente encontradas no pacote java.util, especialmente na classe Date. No entanto, é importante notar que a classe Date em Java tem várias limitações e é considerada obsoleta para muitos propósitos desde a introdução do Java 8. Praticamente ninguém mais utiliza date, quando está lidando com sistemas mordenas, mas é necessário saber como ele funciona.
 */
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); //long
        System.out.println(date);

        /*
         * Coisas que preciso saber: Na classe Date do Java, o tipo long é utilizado para representar o tempo em milissegundos desde a meia-noite de 1º de janeiro de 1970 UTC (Epoch Unix). Este valor é conhecido como timestamp ou instant. Praticamente todos os métodos desta classe Date, está absoleto.
         */
    }
}
