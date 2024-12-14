package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Exemplo simples de uso da API NIO para manipulação de caminhos de arquivos.
 * 
 * - Cria um objeto Path para um arquivo específico.
 * - Obtém e imprime o nome do arquivo a partir do caminho.
 */
public class PathTest01 {
    public static void main(String[] args) {

        // 'Path' representa um caminho no sistema de arquivos e não pode ser criado diretamente.
        // 'Paths.get' é um método estático que cria um objeto 'Path' combinando o diretório e o nome do arquivo.
        Path p1 = Paths.get("D:\\Desktop\\Java_Jiraya\\src\\pasta2", "arquivo_renomeado2.txt");
        

        // Obtém e imprime o nome do arquivo a partir do caminho especificado
        System.out.println(p1.getFileName());
    }
}
