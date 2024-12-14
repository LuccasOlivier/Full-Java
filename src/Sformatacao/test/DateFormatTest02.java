package Sformatacao.test;
import java.text.DateFormat;
import java.util.Calendar;

// Criando uma data formatada individualmente, sem criar arrays.

public class DateFormatTest02 {
    public static void main(String[] args) {
        // Obtém uma instância do calendário atual
        Calendar calendar = Calendar.getInstance();

        // Obtém uma instância de DateFormat padrão para o local padrão
        DateFormat dateFormat = DateFormat.getInstance();

        // Formata e imprime a data atual usando o DateFormat padrão
        String dataFormatada = dateFormat.format(calendar.getTime());

        System.out.println("Data formatada: " + dataFormatada);
    }
}
