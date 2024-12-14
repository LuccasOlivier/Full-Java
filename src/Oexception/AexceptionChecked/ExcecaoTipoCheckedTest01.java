package Oexception.AexceptionChecked;

import java.io.FileReader;
import java.io.IOException;

public class ExcecaoTipoCheckedTest01 {
    public static void main(String[] args) {
        String caminhoAbsoluto = "D:\\Desktop\\Java_Jiraya\\src\\Oexception\\exceptionChecked\\arquivo.txt.txt";

        try{
            FileReader fr = new FileReader(caminhoAbsoluto);
            fr.close();
            System.out.println("Arquivo aberto com sucesso.");
        }catch(IOException e){
             System.out.println("Ocorreu um erro de E/S: " + e.getMessage());
        }
    }
    /*Neste caso, o código acima tenta abrir o arquivo "arquivo.txt" usando FileReader fr = new FileReader("arquivo.txt");.Se o arquivo existir e tiver seu caminho passado corretamente, aparecerá uma mensagem informando que o arquivo foi aberto com sucesso. No entanto, se o arquivo não existir ou se ocorrer qualquer problema durante a abertura do arquivo, uma IOException será lançada. Como IOException é uma exceção verificada, o compilador exige que você a trate usando try-catch ou a declare no método que pode lançá-la.
 */
}

