package Wnio.test;

/**
 * A classe SimpleFileVisitor faz parte do pacote java.nio.file e oferece uma implementação abstrata de FileVisitor.
 * Ela é utilizada para percorrer arquivos e diretórios de forma recursiva, permitindo definir comportamentos personalizados
 * para quando arquivos ou diretórios são visitados, ou quando ocorrem falhas na visitação.
 * 
 * Este exemplo utiliza SimpleFileVisitor para listar todos os arquivos com a extensão ".java" no diretório atual e seus subdiretórios.
 * O método visitFile é sobrescrito para filtrar e exibir os arquivos com a extensão .java.
 */

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Classe que estende SimpleFileVisitor para personalizar a visitação de arquivos.
class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    // Método chamado ao visitar um arquivo.{
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // Verifica se o arquivo tem a extensão .java.
        if (file.getFileName().toString().endsWith(".java")) {
            // Exibe o nome do arquivo que é .java.
            System.out.println(file.getFileName());
        }
        // Continua a visitação para os próximos arquivos.
        return FileVisitResult.CONTINUE;
    }
}

// Classe principal do programa.
public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        // Define o diretorio atual como ponto de partida para a visitação
        Path root = Paths.get(".");
        // Inicia a visitação recursiva a partir do diretorio root
        Files.walkFileTree(root, new ListAllFiles());

        /*
         * O que o Files.walkFileTree faz basicamente:
         * Ele entra em todas as pastas (diretórios) a partir do diretório inicial que
         * você especificou. Visita todos os arquivos e subdiretórios dentro dessas
         * pastas.Se encontrar outros subdiretórios, ele entra nesses também, repetindo
         * esse processo de forma recursiva até que todos os arquivos e pastas tenham
         * sido visitados.
         */
    }
}
