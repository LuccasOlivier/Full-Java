package Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de uso da classe SimpleDateFormat para formatar uma data
 * conforme um padrão específico.
 */
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // Mascara que Define um padrão de formatação para a data e hora
        String pattern = "dd/MM/yyyy | 'horas:' HH:mm:ss z";

        // Criando uma instância de SimpleDateFormat com o padrão especificado
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // Formatando e imprimindo a data atual de acordo com o padrão definido
        System.out.println(sdf.format(new Date())); //Esse new Date Obtém a data e hora atuais do sistema

    }
}
