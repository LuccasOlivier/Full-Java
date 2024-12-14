package M0polimorfismo.service;

import M0polimorfismo.POI.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando de um arquivo");
    }
}
