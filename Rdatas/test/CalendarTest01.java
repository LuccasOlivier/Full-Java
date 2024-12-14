package Rdatas.test;

import java.util.Calendar;


public class CalendarTest01 {
    public static void main(String[] args) {
        // Obtendo uma instância de Calendar
        Calendar c = Calendar.getInstance();

        // Obtendo e imprimindo a data e hora atual
        System.out.println("Data e hora atual: " + c.getTime());

        // Verificando se domingo é o primeiro dia da semana no calendário atual
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        // Obtendo e imprimindo o dia da semana atual
        System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));

        // Obtendo e imprimindo o dia do mês atual
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

        // Obtendo e imprimindo o dia do ano atual
        System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));

        // Obtendo e imprimindo o dia da semana no mês atual
        System.out.println("Dia da semana no mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // Exemplo: Obtendo o último dia do mês atual
        
        System.out.println("Último dia do mês: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));

        // Exemplo: Verificando se o ano atual é bissexto
        boolean isAnoBissexto = c.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        System.out.println("Ano bissexto? " + isAnoBissexto);

        // Adicionando 2 dias ao calendário
        c.add(Calendar.DAY_OF_MONTH, 2);

        // Adicionando 2 horas ao calendário
        c.add(Calendar.HOUR_OF_DAY, 2);

        // Imprimindo a nova data formatada
        System.out.println("Data após adição de 2 dias e 2 horas: " + c.getTime());
    }
}
