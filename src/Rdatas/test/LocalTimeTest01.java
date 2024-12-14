package Rdatas.test;

import java.time.LocalTime;

//A Classe Local Time trabalha com horas

public class LocalTimeTest01 {
    public static void main(String[] args){

        //Criando horário atual

        LocalTime TimeNow = LocalTime.now();
        System.out.println("Hora agora: " + TimeNow);

        //Criando uma hora específica
        LocalTime specificTime = LocalTime.of(15,20,0);
        System.out.println("Hora específica: " + specificTime);

        //Métodos interessantes da classe localTime
        System.out.println("Método get hora: "+specificTime.getHour());
        System.out.println("Método get minuto: "+specificTime.getMinute());
        System.out.println("Método get segundo: "+specificTime.getSecond());
        System.out.println("Pegando a hora mínima através do método MIN: " + LocalTime.MIN);
        System.out.println("Pegando a hora máxoma através do método MAX: " + LocalTime.MAX);
    }
}
