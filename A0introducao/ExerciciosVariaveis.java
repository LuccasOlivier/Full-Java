/*Crie variáveis para os campos descritos abaixo entre () e imprima a seguinte mensagem: Eu (nome), morando no endereço (endereço), confirmo que recebi o salário de (salario), na data (data).*/
public class ExerciciosVariaveis {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua Pedro Alvares Cabral, 255, JOAO BRAZ, Viçosa - MG";
        float salario = 2000f;
        String data = "19/05/24";

        System.out.println("Eu " + nome + " residindo no endereço " + endereco + ", confirmo que recebi o salário de "
                + salario + " na data: " + data);
    }
}