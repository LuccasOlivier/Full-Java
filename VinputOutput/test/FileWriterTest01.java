import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A classe FileWriterTest01 demonstra como usar a classe FileWriter para escrever dados em um arquivo de texto.
 * 
 * A classe FileWriter faz parte do pacote java.io e é usada para escrever caracteres em um arquivo. 
 * Ela permite que você crie e escreva em arquivos de texto com suporte para encoding de caracteres. 
 * O construtor FileWriter que aceita um parâmetro booleano 'append' permite que você escolha se deseja 
 * sobrescrever o arquivo existente (quando append é false) ou adicionar ao final do arquivo existente (quando append é true).
 * 
 * A estrutura try-with-resources é usada para garantir que o FileWriter seja fechado automaticamente, liberando 
 * qualquer recurso associado e garantindo que os dados sejam gravados corretamente.
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        // Criação do objeto File que representa o arquivo "file.txt"
        File file = new File("file.txt");

        // O FileWriter é criado dentro do bloco try-with-resources. 
        // O parâmetro 'true' no construtor indica que os dados serão adicionados ao final do arquivo.
        // Se 'true' for substituído por 'false', o arquivo será sobrescrito a cada execução.
        try (FileWriter fileWriter = new FileWriter(file)) {
            // Escreve a string fornecida no arquivo.
            fileWriter.write("In the name of Jesus, I have a job at Capgemini. Amen!");

            // O método flush() garante que todos os dados sejam enviados ao arquivo imediatamente.
            // Embora o try-with-resources feche o FileWriter automaticamente, flush() pode ser útil em cenários
            // onde é importante garantir que os dados sejam gravados antes de prosseguir.
            fileWriter.flush();
        } catch (IOException e) {
            // Captura e imprime qualquer exceção de entrada/saída que possa ocorrer.
            e.printStackTrace();
        }
    }
}
