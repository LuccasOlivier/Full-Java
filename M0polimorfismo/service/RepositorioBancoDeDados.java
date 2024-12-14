package M0polimorfismo.service;

import M0polimorfismo.POI.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando no Banco de Dados");
    }
}
