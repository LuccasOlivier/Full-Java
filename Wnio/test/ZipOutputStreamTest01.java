package Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * A classe ZipOutputStream é uma implementação de um fluxo de saída (OutputStream)
 * que permite escrever arquivos comprimidos no formato ZIP. 
 * Ela é usada para criar arquivos ZIP, incluindo múltiplos arquivos e pastas, 
 * e para adicionar entradas (arquivos ou diretórios) a esse arquivo ZIP.
 * 
 * Neste exemplo, a classe cria um arquivo ZIP e adiciona arquivos de um diretório especificado a ele.
 * O fluxo ZIP é fechado automaticamente após a conclusão.
 */
public class ZipOutputStreamTest01 {
    
    public static void main(String[] args) {
        // Caminho onde o arquivo ZIP será criado
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        
        // Caminho do diretório cujos arquivos serão compactados no arquivo ZIP
        Path arquivosParaZipar = Paths.get("Pasta/subpasta/subsubpasta");
        
        // Chama o método zip para criar o arquivo ZIP
        zip(arquivoZip, arquivosParaZipar);
    }

    /**
     * Método para compactar arquivos de um diretório em um arquivo ZIP.
     *
     * @param arquivoZip Caminho do arquivo ZIP a ser criado.
     * @param arquivosParaZipar Caminho do diretório cujos arquivos serão adicionados ao ZIP.
     */
    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (
            // Cria um ZipOutputStream para escrever no arquivo ZIP
            ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            
            // Cria um DirectoryStream para listar os arquivos do diretório a ser compactado
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)
        ) {
            // Itera sobre todos os arquivos e subdiretórios dentro do diretório especificado
            for (Path file : directoryStream) {
                // Cria uma nova entrada (ZipEntry) para cada arquivo
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                
                // Adiciona a entrada ao arquivo ZIP
                zipStream.putNextEntry(zipEntry);
                
                // Copia o conteúdo do arquivo para o arquivo ZIP
                Files.copy(file, zipStream);
                
                // Fecha a entrada no arquivo ZIP (indica que o arquivo foi completamente adicionado)
                zipStream.closeEntry();
            }
            
            // Exibe uma mensagem de sucesso quando o arquivo ZIP for criado corretamente
            System.out.println("Arquivo zip criado com sucesso.");
        } catch (IOException e) {
            // Em caso de erro, imprime o erro
            e.printStackTrace();
        }
    }
}
