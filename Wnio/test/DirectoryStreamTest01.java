package Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Esta classe demonstra o uso da interface DirectoryStream para listar o conteúdo de um diretório.
 * 
 * A interface DirectoryStream faz parte da API NIO (New Input/Output) do Java e
 * é usada para iterar sobre os arquivos e subdiretórios dentro de um diretório específico. Com DirectoryStream, é possível listar os arquivos e subdiretórios de forma eficiente, evitando o carregamento de todos os itens na memória de uma só vez. Também é possível
 * aplicar filtros para listar apenas os arquivos ou diretórios que atendem a certos critérios.
 */

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        // Define o caminho do diretório cujo conteúdo será listado
        Path dir = Paths.get(".");

        try {
            // Abre um DirectoryStream para o diretório especificado
            // O try-with-resources garante que o DirectoryStream seja fechado automaticamente
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                
                // Itera sobre cada entrada no DirectoryStream
                for (Path entry : stream) {
                    // Imprime o nome do arquivo ou subdiretório
                    System.out.println(entry.getFileName());
                }
            }
        } catch (IOException e) {
            // Trata exceções que podem ocorrer ao acessar o diretório ou ler o conteúdo
            e.printStackTrace();
        }
    }
}
