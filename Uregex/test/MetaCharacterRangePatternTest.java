/*
    Essa classe é focada na explicação da Meta Character RANGE. A classe RegexPatternMatcherRange também explica. Nessa iremos complementar mais coisas para entendermos ainda melhor.

 * Em expressões regulares (regex), os colchetes `[]` são usados para definir intervalos de caracteres.
 * 
 * - `[a-z]` corresponde a qualquer letra minúscula de 'a' a 'z'.
 * - `[A-Z]` corresponde a qualquer letra maiúscula de 'A' a 'Z'.
 * - `[0-9]` corresponde a qualquer dígito de '0' a '9'.
 * - `[a-zA-Z0-9]` corresponde a qualquer letra (maiúscula ou minúscula) ou dígito.
 * - `[^0-9]` corresponde a qualquer caractere que não seja um dígito.
 * 
 * Para negar um intervalo, coloque um acento circunflexo `^` no início dos colchetes.
  
*/
package Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacterRangePatternTest{
    public static void main(String[] args) {
    
        String regex = "[a-zA-C]";
        String texto = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}