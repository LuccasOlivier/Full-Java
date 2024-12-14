public class InstanciaCarro {
    //Crie uma classe carro com o seguinte atributos: Nome, Modelo, Ano. Em seguida, crie dois objetos distintos e imprima seus valores.

    public static void main (String[] args){
        ClasseCarro carro1 = new ClasseCarro();
        ClasseCarro carro2 = new ClasseCarro();
        
        carro1.nome = "Mustang";
        carro1.modelo = "GTI";
        carro1.ano = 2019;

        carro2.nome = "Camaro";
        carro2.modelo = "Sport";
        carro2.ano = 2015;
        
        carro1 = carro2; //Referência de objetos

        System.out.println("Objeto 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);

        System.out.println("--------------");

        System.out.println("Objeto 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
