public class EstruturasDeRepeticoes {
    public static void main(String[] args) {
        // While / Do while / for

        // While
        System.out.println("While");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do while - Executa pelo menos uma vez, independente de ser verdadeiro ou
        // falso.
        System.out.println("--------------------");
        System.out.println("Do While");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j > 2);

        System.out.println("---------------------");
        System.out.println("FOR");

        // for
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        //Foreach
        System.out.println("---------------------");
        System.out.println("Usando Foreach");

        //incializando um array com valores direto
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        //Sem Foreach ficaria:
        System.out.println("Mesmo exercicio do foreach, usando apenas o for");
        for(int h = 1; h <= numeros.length; h++){
            System.out.println(h);
        }
        // Exercício for - Imprima apenas os números pares de 0 a 50
        System.out.println("Exercício FOR - Imprima os numeros pares de 0 a 50");
        for (int l = 0; l <= 50; l++) {
            if (l % 2 == 0) {
                System.out.println("Número par: " + l);
            }
        }

        //Inicializando array com valores direto e usando Foreach
        System.out.println("Inicializando array com valores direto e usando Foreach");
        String[] array = {"Lucas", "Rafael", "Carlos"};

        for (String arrays : array) {
            System.out.println(arrays);
        }
        
    }
}