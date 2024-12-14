package Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * A classe ZipOutputStream � uma implementa��o de um fluxo de sa�da (OutputStream)
 * que permite escrever arquivos comprimidos no formato ZIP. 
 * Ela � usada para criar arquivos ZIP, incluindo m�ltiplos arquivos e pastas, 
 * e para adicionar entradas (arquivos ou diret�rios) a esse arquivo ZIP.
 * 
 * Neste exemplo, a classe cria um arquivo ZIP e adiciona arquivos de um diret�rio especificado a ele.
 * O fluxo ZIP � fechado automaticamente ap�s a conclus�o.
 */
public class ZipOutputStreamTest01 {
    
    public static void main(String[] args) {
        // Caminho onde o arquivo ZIP ser� criado
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        
        // Caminho do diret�rio cujos arquivos ser�o compactados no arquivo ZIP
        Path arquivosParaZipar = Paths.get("Pasta/subpasta/subsubpasta");
        
        // Chama o m�todo zip para criar o arquivo ZIP
        zip(arquivoZip, arquivosParaZipar);
    }

    /**
     * M�todo para compactar arquivos de um diret�rio em um arquivo ZIP.
     *
     * @param arquivoZip Caminho do arquivo ZIP a ser criado.
     * @param arquivosParaZipar Caminho do diret�rio cujos arquivos ser�o adicionados ao ZIP.
     */
    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (
            // Cria um ZipOutputStream para escrever no arquivo ZIP
            ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            
            // Cria um DirectoryStream para listar os arquivos do diret�rio a ser compactado
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)
        ) {
            // Itera sobre todos os arquivos e subdiret�rios dentro do diret�rio especificado
            for (Path file : directoryStream) {
                // Cria uma nova entrada (ZipEntry) para cada arquivo
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                
                // Adiciona a entrada ao arquivo ZIP
                zipStream.putNextEntry(zipEntry);
                
                // Copia o conte�do do arquivo para o arquivo ZIP
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
