import java.io.File;
import java.io.IOException;

/**Esta Classe trata-se de DIRETORIOS especificamente.
 * 
 * Classe FileTest02 demonstra operações básicas com diretórios e arquivos usando a classe File.
 * A classe File permite criar, renomear e manipular arquivos e diretórios no sistema de arquivos.
 */
public class FileTest02 { 
    public static void main(String[] args) throws IOException {
        // Cria uma instância File para o diretório "pasta"
        File fileDiretorio = new File("pasta");

        // Cria o diretório "pasta". Retorna true se criado com sucesso.
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println("Diretório criado? " + isDiretorio);

        // Cria um arquivo "arquivo.txt" dentro do diretório "pasta"
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");

        // Cria o arquivo "arquivo.txt". Retorna true se criado com sucesso.
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado dentro do diretório? " + isFileCreated);

        // Prepara para renomear o arquivo "arquivo.txt" para "arquivo_renomeado2.txt"
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado2.txt");

        // Renomeia o arquivo para "arquivo_renomeado2.txt". Retorna true se renomeado com sucesso.
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? " + isRenamed);

        // Prepara para renomear o diretório "pasta" para "pasta2"
        File diretorioRenomeado = new File("pasta2");

        // Renomeia o diretório para "pasta2". Retorna true se renomeado com sucesso.
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretório renomeado? " + isDiretorioRenomeado);
    }
}
