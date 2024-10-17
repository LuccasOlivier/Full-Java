package Linterface;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo os dados do banco de dados");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados");
    }
}
