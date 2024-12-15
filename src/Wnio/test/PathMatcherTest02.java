package Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// A classe FindAllTestJavaOrClass estende SimpleFileVisitor para poder percorrer a árvore de diretórios e arquivos.
class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {

    // Definindo um PathMatcher para combinar arquivos que atendam ao padrão de nome
    // 'Test*.java' ou 'Test*.class'
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    // Método sobrescrito para ser chamado toda vez que um arquivo for visitado
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        // Se o arquivo corresponder ao padrão especificado pelo matcher, o nome do
        // arquivo é impresso
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }

        // Continua a visitação nos próximos arquivos/diretórios
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {

    public static void main(String[] args) throws IOException {

        // Define o caminho raiz a ser percorrido (diretório atual)
        Path root = Paths.get(".");

        // Inicia a caminhada pela árvore de diretórios e arquivos, utilizando o
        // visitante FindAllTestJavaOrClass
        Files.walkFileTree(root, new FindAllTestJavaOrClass());
    }
}