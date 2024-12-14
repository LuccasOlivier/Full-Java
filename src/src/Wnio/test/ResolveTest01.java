package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Classe de exemplo para demonstrar a combinação de caminhos usando o método `resolve` da classe `Path`.
 */

public class ResolveTest01 {
    public static void main(String[] args){
        // Define o caminho base do diretório
        Path dir = Paths.get("home/lucas");

        // Define o caminho relativo do arquivo
        Path arquivo = Paths.get("dev/arquivo.txt");
        
        // Resolve o caminho relativo em relação ao caminho base
        Path resolve = dir.resolve(arquivo);

        // Imprime o caminho resolvido
        System.out.println("Caminho resolvido: " + resolve);
    }
}