
import java.io.File;
import java.io.IOException;
import java.util.Date;


/*
 *      Atenção: Para criar um arquivo, basta fazer isso: 
 *      
 *      //Criando um objeto file
 *      File file = new File("file.txt");

        //Criando de fato o arquivo através do método createnewFile
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Mas demonstramos nesta Classe alguns métodos úteis além deste, por isso há bastante informações, mas a criação do arquivo em si é simples, como vimos acima. Porém, veja os demais métodos que são importantes também.
 */
public class FileTest01 {
    public static void main(String[] args) {
        //Criando um objeto file
        File file = new File("file.txt");

        //Criando de fato o arquivo através do método createnewFile
        try {
            Boolean isCreated = file.createNewFile();// Método para criar o arquivo. Para criar o arquivo basta fazer: file.createNewFile(). Criei uma variável apenas para imprimir false e vermos que ele não sobrescreve após o arquivo ter sido criado.
            System.out.println("Created: "+ isCreated);//depois de criado 1 vez, ele retorna falso
            System.out.println("path (caminho): "+file.getPath());//método retorna o caminho do arquivo 
            System.out.println("Path absoluto (caminho: )"+file.getAbsolutePath());//método retorna o  retorna o caminho absoluto do arquivo
            System.out.println("Is directory: " + file.isDirectory()); // Método para saber se ele é um diretório
            System.out.println("Is file: " + file.isFile()); // Método para saber se é um arquivo
            System.out.println("Is hidden: " + file.isHidden()); // Método para saber se o arquivo é oculto
            System.out.println("Last modified: " + new Date(file.lastModified()));// Método após o arquivo ter sido modificado. OBS: usamos o new Date para retornar a data, se nao se chamarmos apenas o metodo lastModified sozinho, ele mostra um long. 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


