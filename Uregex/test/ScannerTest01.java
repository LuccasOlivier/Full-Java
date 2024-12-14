package Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args){
        String texto = "Levi, Eren, Mikasa";

        // Divide a string em tokens usando a vírgula como delimitador
        String[] nomes = texto.split(",");// Obs: o delimitador não necessariamente precisa ser a vírgula, poderia ser espaços em branco ou outra coisa. Caso eu queira limitar por digitos, por exemplo, eu poderia fazer: String[] nomes = texto.split (\\d); caso houve digitos no lugar da vírgula.

        // Loop for each para imprimir cada nome
        for(String nome: nomes){
            System.out.println(nome.trim()); //trim para remover os espaços
        }

        // Loop alternativo 
        /*for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }*/
    }
}
