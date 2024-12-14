package Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        // Cria instâncias de Locale para diferentes regiões

        Locale localBrasil = new Locale("pt", "BR");// Português no Brasil

        Locale localeItaly = new Locale("it", "IT"); // Italiano na Itália
        
        Locale localeCH = new Locale("it", "CH");           // Italiano na Suíça
        
        Locale localeIndia = new Locale("hi", "IN");        // Hindi na Índia
        
        Locale localeJapao = new Locale("ja", "JP");        // Japonês no Japão
        
        Locale localeHolanda = new Locale("nl","NL");       // Holandês na Holanda

        // Obtém uma instância do calendário atual
        Calendar calendar = Calendar.getInstance();
        
        // Cria DateFormat para cada Locale especificado
        DateFormat df0 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);    // Formato completo para o Brasil
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);   // Formato completo para a Itália
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);      // Formato completo para a Suíça
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);   // Formato completo para a Índia
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);   // Formato completo para o Japão
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda); // Formato completo para a Holanda
        
        // Imprime as datas formatadas para cada Locale
        System.out.println("Brasil: " + df0.format(calendar.getTime()));
        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suíça: " + df2.format(calendar.getTime()));
        System.out.println("Índia: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));
    }
}
