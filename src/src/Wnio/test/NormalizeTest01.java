package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * Classe de exemplo para demonstrar a normalização de caminhos de arquivos.
 */
public class NormalizeTest01 {
    public static void main(String[] args) {
        // Diretório base onde o arquivo está localizado
        String diretorioProjeto = "home/lucas/dev";

        // Caminho relativo do arquivo, que inclui referências para o diretório pai
        String arquivoTxt = "../../arquivo.txt";

        // Cria um objeto Path combinando o diretório base com o caminho relativo
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);

        // Imprime o caminho combinado antes da normalização
        System.out.println("Caminho combinado: " + path1);

        // Normaliza o caminho para resolver referências relativas e simplificar o caminho
        System.out.println("Arquivo normalizado: " + path1.normalize());
    }
}
