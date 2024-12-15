package QClassesUtilitáriasStrings;

public class StringTest02 {
    public static void main(String[] args){
        //Demonstração de Métodos Utilitários de Strings em Java

        String name = "Lucas";
        String numeros = "1,2,3,4,5";
        String name2 = " Oliveira ";
        
        // Retorna o caractere no índice especificado (começando em 0)
        System.out.println(name.charAt(4)); // Saída: 's'
        
        // Retorna o comprimento (tamanho) da string
        System.out.println(name.length()); // Saída: 5
        
        // Substitui todas as ocorrências do caractere ou sequência de caracteres especificados por outro caractere ou sequência
        System.out.println(name.replace("c","k")); // Saída: Lukas
        
        // Converte todos os caracteres da string para minúsculas
        System.out.println(name.toLowerCase()); // Saída: lucas
        
        // Converte todos os caracteres da string para maiúsculas
        System.out.println(name.toUpperCase()); // Saída: LUCAS
        
        // Retorna uma substring da string original, começando do índice inicial até o índice final-1
        System.out.println(numeros.substring(0,3)); // Saída: "1,2"
        
        // Retorna uma substring da string original, começando do índice especificado até o final da string
        System.out.println(numeros.substring(2,numeros.length())); // Saída: "2,3,4,5"

        // Exibe a string original, incluindo os espaços antes e depois
        System.out.println(name2); // Saída: "  Oliveira "
        
        // Retorna uma nova string removendo os espaços em branco no início e no fim da string original
        System.out.println(name2.trim()); // Saída: "Oliveira"
    }
}
