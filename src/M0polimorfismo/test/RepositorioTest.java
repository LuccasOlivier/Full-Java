package M0polimorfismo.test;

import M0polimorfismo.POI.Repositorio;
import M0polimorfismo.service.RepositorioArquivo;
import M0polimorfismo.service.RepositorioBancoDeDados;
import M0polimorfismo.service.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();

        repositorioBancoDeDados.salvar();

        //Perceba que se eu fizer isso acima, eu estarei salvando em um banco dados. Mas, digamos que por algum motivo você precise salvar em um arquivo. Logo, se trocarmos por = new Repositorio Arquivo(); vai dar erro, pois eles não estão na mesma linha de herança. Logo eu teria que trocar o tipo para: RepositorioArquivo repArquivo = new RepositorioArquivo(); Para evitar isso, usamos programação orientada a interface, onde criamos uma variável do tipo mais genérico, Repositorio, que pode apontar para qualquer implementação de Repositorio. Isso facilita a substituição sem modificar outros trechos do código.

        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();
        
    }
}
