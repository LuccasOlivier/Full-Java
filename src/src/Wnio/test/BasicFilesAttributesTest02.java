package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Classe de exemplo que demonstra como ler e modificar os atributos básicos de um arquivo
 * usando a API NIO do Java.
 * 
 * A classe utiliza BasicFileAttributes para leitura de atributos de um arquivo, e BasicFileAttributeView para modificar esses atributos.
 */
public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        // Caminho do arquivo para teste
        Path path = Paths.get("pasta2/newarquivo.txt");

        // Lendo os atributos básicos do arquivo
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        // Obtendo e imprimindo os tempos de criação, modificação e acesso do arquivo
        FileTime creationFileTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation Time: " + creationFileTime);
        System.out.println("Last Modified Time: " + lastModifiedTime);
        System.out.println("Last Access Time: " + lastAccessTime);

        System.out.println("------------");

        // Obtendo uma visão de atributos do arquivo que permite modificar seus atributos
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        
        // Atualizando o tempo de criação para o tempo atual
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationFileTime);

        // Lendo os atributos novamente para verificar as mudanças
        creationFileTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Updated Creation Time: " + creationFileTime);
        System.out.println("Updated Last Modified Time: " + lastModifiedTime);
        System.out.println("Updated Last Access Time: " + lastAccessTime);
    }
}
