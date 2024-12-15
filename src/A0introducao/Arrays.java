public class Arrays {
    public static void main(String[] args) {

        /*
         * String [] nomes = new String [3];
         * 
         * nomes[0] = "Lucas";
         * nomes[1] = "João";
         * nomes[2] = "Pedro";
         * 
         * //System.out.println("Nome: "+ nomes[0]);
         * 
         * //Percorrer um array usando loop for
         * for(int i = 0; i < nomes.length; i++){
         * System.out.println(nomes[i]);
         * }
         * 
         * //Inicialização rápida com valores
         * 
         * int[] age = {1,2,3,4,5};
         * System.out.println(age[0]);
         */
        // Arrays multidimensionais
        /*
         * int[][] matriz = {
         * { 1, 2, 3, 4 },
         * { 5, 6, 7, 8 },
         * { 9, 10, 11, 12 }
         * };
         * 
         * for (int i = 0; i < matriz.length; i++) {// Itera sobre as linhas
         * for (int j = 0; j < matriz[i].length; j++) {// Itera sobre as colunas
         * System.out.print(matriz[i][j] + " ");
         * }
         * System.out.println(); // Nova linha para cada linha da matriz
         * }
         * 
         * System.out.println("Array multidimensional com Foreach");
         * 
         * //Array multidimensional com Foreach
         * for(int[] linha : matriz){// Itera sobre as linhas
         * for(int elemento : linha){// Itera sobre os elementos de cada linha
         * System.out.print(elemento + " ");
         * }
         * System.out.println();// Nova linha para cada linha da matriz
         * }
        
        // Formas de inicializar um Array

        //Inicialização com tamanhos definidos e valores atribuídos posteriormente
        int[][] arrayInt = new int[3][]; // perceba que eu nao preciso iniciar o segundo "[] com um valor, eu posso
                                         // definir depois, veja abaixo:"

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        // Entao o [0], [1], [2] estão relacionados ao new int[3], já o new int [2],[3]
        // e [6] estão relacionado ao "[]" vazio, que agora foram adicionados valores. Esses arrays são semelhantes a caixas. No caso, (3) caixas, cada uma com um espaço específico: 2, 3 e 6.
        // Veja o resultado:

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        //Inicialização com tamanhos definidos e valores atribuídos diretamente
        
        int[][] arrayInt2 = new int[3][]; 

        arrayInt2[0] = new int[] {1,2};
        arrayInt2[1] = new int[] {1,2,3};
        arrayInt2[2] = new int[] {1,2,3,4,5,6};
         */
        
        //Inicialização direta com valores. Uso típico: Esta é a forma mais comum e prática, especialmente quando os valores são conhecidos de antemão. É concisa e fácil de ler.

        int[][] arrayInt3 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for(int[] arrayBase: arrayInt3){
            System.out.println("----");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}