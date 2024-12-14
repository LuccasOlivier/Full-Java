package Zelevador;

import java.util.Scanner;

public class TestElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        Scanner input = new Scanner(System.in);
        String chamada;
        int andar;

        do {
            System.out.println("Para chamar o elevador, digite chamar: ");
            chamada = input.nextLine();
        } while (!chamada.equals("chamar"));

        elevador.chamar(chamada);

        System.out.println("Digite o andar de destino: ");
        andar = input.nextInt();
        elevador.mover(andar);

        input.close();
    }
}
