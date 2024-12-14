package Linterface;

public interface DataLoader {
    //Os métodos de uma interface já são implicitamente public e abstract, então não é preciso declarar public abstract antes do nome do método, pois seria redundante.
    void load();

// Métodos default permitem adicionar novos métodos em interfaces sem quebrar o código existente.
// As classes que implementam a interface não são obrigadas a sobrescrever métodos default, mas precisam implementá-los se usados.
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
