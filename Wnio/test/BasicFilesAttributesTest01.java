package Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Classe BasicFilesAttributesTest01
 * 
 * Descrição: Esta classe demonstra como usar a classe BasicFileAttributes para obter informações básicas sobre um arquivo no sistema de arquivos. A classe BasicFileAttributes faz parte do pacote java.nio.file.attribute e fornece informações como a data de criação, a última modificação, o tamanho e se o caminho é um diretório ou um arquivo regular.
 * 
 * Funcionamento:
 * 1. Verifica se o arquivo especificado existe no diretório "pasta2".
 * 2. Se o arquivo não existir, ele é criado.
 * 3. Os atributos básicos do arquivo são lidos e exibidos no console.
 * 4. A data e hora atual também são exibidas para comparação.
 * 5. Caso ocorra algum erro (por exemplo, se o caminho estiver incorreto ou o arquivo não puder ser criado), uma exceção será capturada e a pilha de rastreamento será exibida.
 */
public class BasicFilesAttributesTest01 {
    public static void main(String[] args) {
        // Caminho para o arquivo no diretório "pasta2"
        Path path = Paths.get("pasta2/arquivotest.txt");

        try {
            // Verifica se o arquivo existe no caminho especificado
            if (!Files.exists(path)) {
                // Cria o arquivo se ele não existir
                Files.createFile(path);
                System.out.println("Arquivo criado com sucesso.");
            }

            // Obtém os atributos básicos do arquivo
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

            // Obtém a data e hora atual no fuso horário do sistema
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

            // Exibe informações sobre o arquivo
            System.out.println("Data e hora atual: " + now);  // Data e hora atual no fuso horário de São Paulo
            System.out.println("Criado em: " + attrs.creationTime());  // Data e hora de criação do arquivo
            System.out.println("Última modificação: " + attrs.lastModifiedTime());  // Data e hora da última modificação do arquivo
            System.out.println("Tamanho: " + attrs.size() + " bytes");  // Tamanho do arquivo em bytes
            System.out.println("É um diretório? " + attrs.isDirectory());  // Verifica se é um diretório
            System.out.println("É um arquivo comum? " + attrs.isRegularFile());  // Verifica se é um arquivo comum

        } catch (Exception e) {
            // Captura e exibe qualquer exceção que ocorra durante a execução
            e.printStackTrace();
        }
    }
}
