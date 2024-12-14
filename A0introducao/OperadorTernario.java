public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 5100;

        // sem o operador ternario
        /*
         * if (salario > 5000) {
         * System.out.println("eu vou doar 500 reais");
         * } else {
         * System.out.println("Ainda nao tenho condições, mas logo vou poder.");
         * }
         */

        // Com operador ternário
        System.out.println(salario > 5000 ? "eu vou doar 500 reais" : "Ainda nao tenho condições, mas logo vou poder.");

    }
}