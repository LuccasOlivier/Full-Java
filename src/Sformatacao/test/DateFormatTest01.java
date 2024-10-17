package Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;


//Fizemos essa classe para se ter uma idéia geral de como funciona a formatação da maioria dos formatos usados que resolverão 90% dos problemas que você tem. Por isso que fizemos um array para ilustrar de forma geral.


public class DateFormatTest01 {
    public static void main(String[] args) {
        // Obtém uma instância do calendário atual
        Calendar calendar = Calendar.getInstance();
        
        // Cria um array de 7 referências para objetos DateFormat
        DateFormat[] df = new DateFormat[7]; 

        // Obtém uma instância de DateFormat padrão para o local padrão
        df[0] = DateFormat.getInstance();
        
        // Obtém uma instância de DateFormat para formatação de data
        df[1] = DateFormat.getDateInstance();
        
        // Obtém uma instância de DateFormat para formatação de data e hora
        df[2] = DateFormat.getDateTimeInstance();
        
        // Obtém uma instância de DateFormat para formatação de data curta
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        
        // Obtém uma instância de DateFormat para formatação de data média
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        
        // Obtém uma instância de DateFormat para formatação de data longa
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        
        // Obtém uma instância de DateFormat para formatação de data completa
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);
        
        // Itera pelo array df e formata a data atual do calendário para cada formato
        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
