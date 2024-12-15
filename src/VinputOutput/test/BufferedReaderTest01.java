import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * A classe BufferedReaderTest01 demonstra o uso da classe BufferedReader para ler texto de um arquivo.
 * BufferedReader é uma classe que permite ler texto de forma eficiente, utilizando buffers para melhorar o desempenho
 * das operações de leitura. Este exemplo abre um arquivo chamado "file.txt", lê o conteúdo linha por linha e imprime
 * cada linha no console.
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        // Criação do objeto File que representa o arquivo "file.txt"
        File file = new File("file.txt");

        // O bloco try-with-resources garante que o BufferedReader será fechado automaticamente após o uso
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
        
            String linha;  // Variável para armazenar cada linha lida do arquivo
            
            // Lê o arquivo linha por linha até que não haja mais linhas
            while ((linha = bufferedReader.readLine()) != null) {
                // Imprime a linha lida no console
                System.out.println(linha);
            }
        
        // Captura e exibe quaisquer exceções de entrada/saída que ocorram durante a leitura do arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
