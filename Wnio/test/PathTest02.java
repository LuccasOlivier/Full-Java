package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Criando pasta
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Files.createDirectories(pastaPath);
        }else{
            System.out.println("A pasta já existe.");
        }

        // Preparando a criação de subpastas
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        // Criando as subpastas
        Files.createDirectories(subPastaPath);

        // Preparando a criação de um arquivo dentro de subsubpasta
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            //Criando o arquivo
            Files.createFile(filePath);
        }else{
            System.out.println("O arquivo já existe.");
        }

        // Copia o arquivo original e cria uma cópia renomeada no mesmo diretório, substituindo qualquer arquivo existente com o mesmo nome:

        Path source = filePath; // Caminho do arquivo de origem (arquivo original)
       
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt"); // Caminho do arquivo de destino (cópia renomeada)
        
        // Copia o arquivo de origem para o destino e substitui se o destino já existir
        Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);
    }     
}