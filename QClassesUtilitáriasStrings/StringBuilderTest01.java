package QClassesUtilitáriasStrings;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Lucas";
        name.concat(" Oliveira");

        System.out.println(name);

        StringBuilder sb = new StringBuilder("Lucas");
        sb.append(" Santos");
        sb.reverse(); //inverte
        sb.reverse(); //inverte novamente (volta ao normal)
        sb.delete(0, 3); //deleta igual c/ a função igual da substring
        System.out.println(sb.toString());
        //Tudo que fizemos aqui serve para StringBuffer, a idéia é a mesma.
    }
}
