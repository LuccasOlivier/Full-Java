package TresourceBundleTest.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Exemplo de uso da classe ResourceBundle para internacionalização em Java.
 * 
 * A classe ResourceBundle é usada para carregar e acessar recursos localizados,
 * como mensagens e textos, de forma que uma aplicação possa suportar múltiplos idiomas.
 * 
 * Neste exemplo, são carregados dois ResourceBundles:
 * - Um para o inglês (Estados Unidos)
 * - Um para o português (Brasil)
 * 
 * Os arquivos de propriedades devem ser armazenados em um diretório que está no classpath da aplicação.
 * O nome base do bundle deve corresponder ao caminho do pacote onde os arquivos de propriedades estão localizados.
 * 
 * Arquivos de propriedades esperados:
 * - TresourceBundleTest/Resource/messages_en_US.properties
 * - TresourceBundleTest/Resource/messages_pt_BR.properties
 */
public class ExemploResourceBundleTest01 {
    public static void main(String[] args) {
        // Carrega o ResourceBundle para o inglês (EUA)
        ResourceBundle bundle = ResourceBundle.getBundle("TresourceBundleTest.Resource.messages", new Locale("en", "US"));

        // Carrega o ResourceBundle para o português (Brasil)
        ResourceBundle bundle2 = ResourceBundle.getBundle("TresourceBundleTest.Resource.messages", new Locale("pt", "BR"));

        // Obtém as mensagens do ResourceBundle em inglês
        String key1 = bundle.getString("hello");
        String key2 = bundle.getString("good.morning");

        // Obtém as mensagens do ResourceBundle em português
        String key3 = bundle2.getString("hello");
        String key4 = bundle2.getString("good.morning");

        // Exibe as mensagens em inglês
        System.out.println("Inglês:");
        System.out.println(key1); // Exibe: Hello man!
        System.out.println(key2); // Exibe: Good morning, welcome!

        // Exibe as mensagens em português
        System.out.println("Português:");
        System.out.println(key3); // Exibe: Olá mano!
        System.out.println(key4); // Exibe: Bom dia, bem vindo!



    }
}
