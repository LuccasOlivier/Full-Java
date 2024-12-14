package J2modificadorFinal;

public class Main {
    public static void main(String[] args){
        Carro carro = new Carro();

       System.out.println(Carro.VELOCIDADE_LIMITE);

       
       
       //Carro.COMPRADOR = comprador2; // Isso resultaria em um erro de compilação, pois COMPRADOR é final e não pode ser reatribuído. 
       
       /*
        *  O modificador final impede que a variável seja reatribuída a outro objeto após sua inicialização.
        */

       //Porém, Atributos do objeto referenciado podem ser modificados
        carro.COMPRADOR.setNome("Lucas");
        System.out.println(carro.COMPRADOR);
    }
}
