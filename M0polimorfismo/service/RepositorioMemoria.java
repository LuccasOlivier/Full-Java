package M0polimorfismo.service;

import M0polimorfismo.POI.Repositorio;

public class RepositorioMemoria implements Repositorio {
    public void salvar(){
        System.out.println("Salvando em memória");
    }
}
