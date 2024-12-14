package FmodificadorStatic_E_MetodoStatic;

public class TestCarro {
    public static void main(String[] args){
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        //Variáveis 'static' são acessadas usando o nome da classe, em vez de uma instância especifica da classe.
        Carro.setVelocidadeLimite(180);//Chamando o método static setVelocidadeLimite.
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
