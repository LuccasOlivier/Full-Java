package M1leituraDeDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Nome: " + nome + ". Idade: " + idade);
        
        input.close();
    }
}