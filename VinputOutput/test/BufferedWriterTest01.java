import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A classe BufferedWriterTest01 demonstra o uso da classe BufferedWriter para escrever texto em um arquivo. Ela é ideal para arquivos muito grandes, visando melhorar sua performance. A classe BufferedWriter encapsula a Classe  FileWriter.
 * BufferedWriter é uma classe que permite escrever texto de forma eficiente, utilizando buffers para melhorar o desempenho das operações de escrita. Este exemplo cria um arquivo chamado "file.txt" (ou o usa se já existir)
 * e escreve uma linha de texto nele.
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        // Cria um objeto File para o arquivo desejado
        File file = new File("file.txt");

        // O bloco try-with-resources garante que o BufferedWriter será fechado automaticamente após o uso
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            // Escreve uma linha de texto no arquivo
            bw.write("Profetizo minha aprovacao na capgemini");

            // Adiciona uma nova linha ao final do texto escrito
            bw.newLine();

            // Força a escrita de qualquer dado restante no buffer para o arquivo
            // Embora não seja estritamente necessário aqui devido ao uso do try-with-resources, é uma boa prática
            bw.flush();
        } catch (IOException e) {
            // Captura e exibe quaisquer exceções de entrada/saída que ocorram durante a escrita do arquivo
            e.printStackTrace();
        }
    }
}
