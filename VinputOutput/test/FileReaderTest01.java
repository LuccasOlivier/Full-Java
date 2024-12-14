import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * A classe FileReaderTest01 demonstra como usar a classe FileReader para ler dados de um arquivo de texto.
 * 
 * A classe FileReader faz parte do pacote java.io e é utilizada para ler caracteres de um arquivo. 
 * Ela é ideal para ler arquivos de texto usando o encoding de caracteres padrão. 
 * O construtor FileReader cria um objeto que permite a leitura sequencial de caracteres a partir de um arquivo especificado.
 * 
 * A estrutura try-with-resources é usada para garantir que o FileReader seja fechado automaticamente após o uso, 
 * liberando qualquer recurso associado e garantindo que o arquivo seja corretamente fechado.
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        // Criação do objeto File que representa o arquivo "file.txt"
        File file = new File("file.txt");

        // O FileReader é criado dentro do bloco try-with-resources para garantir que o recurso seja fechado automaticamente.
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            // Lê caracteres do arquivo um por um até o final do arquivo ser alcançado (indicado por -1).
            while ((i = fileReader.read()) != -1) {
                // Converte o valor inteiro lido para um caractere e o imprime no console.
                // O método read() retorna um valor inteiro correspondente ao código do caractere.
                System.out.print((char) i);
            }
        } catch (IOException e) {
            // Captura e imprime qualquer exceção de entrada/saída que possa ocorrer durante a leitura do arquivo.
            e.printStackTrace();
        }
    }
}
