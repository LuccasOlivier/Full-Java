package Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class WCalcularIdade {
    public static void main(String[] args) {

        //Data de nascimento
        LocalDate dateOfBirth = LocalDate.of(1977, 3, 22);

        //Data atual
        LocalDate now = LocalDate.now();

        //Calculando o período desde a data de nascimento até hoje
        Period age = Period.between(dateOfBirth, now);

        //Extraindo e exibindo a idade calculada
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        // Utilizando printf para formatar e imprimir a idade com anos, meses e dias
        System.out.printf("Sua idade é: %d anos, %d meses e %d dias.\n", years, months, days);
        
    }
}
