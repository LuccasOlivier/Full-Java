package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Esta classe demonstra como criar um arquivo e definir atributos específicos do sistema de arquivos 
 * DOS (Disk Operating System) usando a API NIO.2 do Java.
 * 
 * Atributos DO DOS:
 * - "dos:hidden": Define o arquivo como oculto.
 * - "dos:readonly": Define o arquivo como somente leitura.
 * 
 * O programa realiza as seguintes etapas:
 * 1. Verifica se o arquivo 'teste.txt' existe no diretório 'pasta'.
 * 2. Se o arquivo não existir, cria o arquivo.
 * 3. Define os atributos 'hidden' e 'readonly' para o arquivo.
 */
public class DosFileAttributeTest01 {
    public static void main(String[] args) {
        // Caminho para o arquivo que será criado e modificado
        Path path = Paths.get("pasta/teste.txt");

        try {
            // Verifica se o arquivo existe
            if (Files.notExists(path)) {
                // Cria o arquivo se ele não existir
                Files.createFile(path);
                System.out.println("Arquivo criado com sucesso.");
            } else {
                System.out.println("Arquivo já existe.");
            }

            // Define o atributo 'hidden' torna o arquivo oculto
            Files.setAttribute(path, "dos:hidden", true);
            System.out.println("Atributo 'hidden' definido com sucesso.");

            // Define o atributo 'readonly' torna o arquivo somente leitura
            Files.setAttribute(path, "dos:readonly", true);
            System.out.println("Atributo 'readonly' definido com sucesso.");
            
        } catch (IOException e) {
            // Captura e exibe qualquer exceção que possa ocorrer durante o processo
            System.err.println("Erro ao acessar ou modificar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
