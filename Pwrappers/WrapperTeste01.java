package Pwrappers;

public class WrapperTeste01 {
    public static void main(String[] args) {
        /*
         * Em Java, "wrappers" se referem às classes que encapsulam tipos primitivos,transformando-os em objetos. Isso é necessário porque em Java, tipos primitivos (como int, char, boolean, etc.) não são objetos e não possuem métodos ou funcionalidades adicionais associadas a eles.
         */

        // Temos 8 tipos primitivos:

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'M';
        boolean booleanP = false;

        // Para criarmos um wrapper, basta colocar a primeira letra do tipo primitivo em
        // maiúscula, com a exceção do int (que vira Integer) e o char que vira
        // (Character).

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'M';
        Boolean booleanW = false;

        // Como podemos ver acima, agora temos classes wrappers que encapsula o tipo primitivo byte.

        // Convertendo uma string para um inteiro
        Integer intValue = Integer.parseInt("1");
    }
}
