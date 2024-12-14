public class Break {
    public static void main(String[] args) {
        // Break - Termina o laço atual e move o controle para a primeira linha de
        // código após o laço. Exercício: faça um programa que conte de 1 a 50 e
        // interrompa quando chegar em 25.

        /*
         * for(int i = 1; i <= 50; i++){
         * if (i > 25) {
         * break;
         * }
         * System.out.println(i);
         * }
         */

        // Exercício Break: Dado o valor de um carro, descubra em quantas vezes ele pode
        // ser parcelado. Condição: valorParcela >= 1000
        // Usamos o break, porque embora nao apareça na saída apos atingir a
        // condição, o codigo continua rodando. Por isso temos que colocar o break,
        // nesse caso.
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}