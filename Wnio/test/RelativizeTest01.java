package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A classe `RelativizeTest01` demonstra o uso do método `relativize` da classe `Path` para calcular o caminho relativo entre dois caminhos. O método `relativize` é útil para converter um caminho absoluto em um caminho relativo em relação a outro caminho.
 */
public class RelativizeTest01 {
    public static void main(String[] args) {
        // Define o caminho para o diretório base
        Path dir = Paths.get("/home/lucas");
        // Define o caminho para o arquivo Java
        Path clazz = Paths.get("/home/lucas/devdojofoda/OlaMundo.java");

        // Calcula o caminho relativo de 'clazz' em relação a 'dir'
        Path pathToClazz = dir.relativize(clazz);

        // Exibe o caminho relativo
        System.out.println(pathToClazz);

        // Define vários caminhos absolutos e relativos para comparação
        Path absoluto1 = Paths.get("/home/lucas");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/lucas/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        // Calcula e exibe os caminhos relativos entre os caminhos absolutos e relativos
        System.out.println("1 "+absoluto1.relativize(absoluto3)); // Caminho relativo de absoluto1 para absoluto3
        System.out.println("2 "+absoluto3.relativize(absoluto1)); // Caminho relativo de absoluto3 para absoluto1
        System.out.println("3 "+absoluto1.relativize(absoluto2)); // Caminho relativo de absoluto1 para absoluto2

        // Calcula e exibe o caminho relativo de relativo1 para relativo2 (ambos são relativos, correto)
        System.out.println("4 "+relativo1.relativize(relativo2)); 

        // EXCEÇÃO: Caminho absoluto ('absoluto1') não pode ser relativizado com caminho relativo ('relativo1')
        // O método 'relativize' requer que ambos os caminhos sejam do mesmo tipo (ou ambos absolutos ou ambos relativos)
        // Portanto, isto lança uma exceção java.lang.IllegalArgumentException
        System.out.println("5 "+absoluto1.relativize(relativo1));
    }
}
