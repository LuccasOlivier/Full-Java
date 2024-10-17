package Rdatas.test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class LocalDateTest01 {
    public static void main (String[] args){
       
        //Esse bloco mostra como utilizavamos datas através da classe Calendar e DateFormat, esse era todo o processo realizado:
        Calendar c = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getInstance();
        String dataFormatada = dateFormat.format(c.getTime());
        System.out.println("Data da classe Calendar e formatada pela classe DateFormat: "+dataFormatada);
        System.out.println("-----------------------------------");    
        //Agora vamos utilizar a classe Local Date que é mais atualizada e simples

        //Um adendo é que a classe Local Date não trabalha com horas, apenas com datas.

        //Criando uma data atual
        LocalDate now = LocalDate.now();
        System.out.println("Data atual sem formatação: " + now);

        System.out.println("--------------------------------------");
        
        System.out.println("Criando uma data especifica:");

        //Criando uma data específica, minha data de nascimento:
        LocalDate dataNascimento = LocalDate.of(1995, 01, 9);

        //Formatando a data específica
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataBR = dataNascimento.format(dataFormatter);
        
        System.out.println("Data formatada: " + dataBR);

        //Outra forma de fazer
        //LocalDate dataNasc = LocalDate.of(1995,Month.JANUARY,9);

        System.out.println("Esta é a minha data de nascimento utilizando a classe LocalDate: " + dataNascimento);

        //Veja a facilidade dos métodos para pegar as informações sem precisar ficar quebrando igual as demais classes:
         System.out.println("Ano: "+dataNascimento.getYear());
         System.out.println("Mês: "+dataNascimento.getMonth());
         System.out.println("Valor do mês (numeral): " + dataNascimento.getMonthValue());
         System.out.println("Dia do mês: "+dataNascimento.getDayOfMonth());
         System.out.println("Dia da semana: " + dataNascimento.getDayOfWeek());
         System.out.println("Tamanho máximo do mês: "+ dataNascimento.lengthOfMonth());
         System.out.println("Ano é bisexto? "+ dataNascimento.isLeapYear());      
    }
}
