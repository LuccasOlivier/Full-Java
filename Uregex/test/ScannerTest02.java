package Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args){
        String texto = "Levi,Eren,Mikasa,true,200";

        // A classe Scanner tem delimitador padrão, que é um espaço em braco.
        Scanner scanner = new Scanner(texto);

        // Como nós queremos utilizar um outro delimitador, precisamos utilizar o useDelimiter e passar o valor que queremos como delimitador:
        scanner.useDelimiter(",");
        
        // Pegando os valores da scanner, perceba que é uma forma diferente da String
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // Fechar a primeira instância
        scanner.close();

        System.out.println("Pegando os valores da scanner com base no tipo deles");

        // Criar uma nova instância do Scanner com o mesmo texto (reinicinado) p poder realizar um segundo while
        scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        
        //Pegando os valores da scanner com base no tipo deles
        while (scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: "+ i);
            }else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            }else{
                System.out.println(scanner.next());
            }
        }

        scanner.close();
    }
}
