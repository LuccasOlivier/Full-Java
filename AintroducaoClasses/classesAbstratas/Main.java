package classesAbstratas;

public class Main {
    public static void main(String[] args) {
       Gerente gerente = new Gerente("Nami", 5000);
       Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 7000);

       
       
       System.out.println(gerente);
       gerente.calcularBonus();

       System.out.println(desenvolvedor);
       desenvolvedor.calcularBonus();
       
    }
}
