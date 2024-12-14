package Oexception.BexceptionUnchecked.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Exceção do tipo Unchecked (Runtime)
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
    /*O tipo de exceção nesse código acima que será causada é ArrayIndexOutOfBoundsException. Esta exceção é lançada em tempo de execução (runtime) quando tentamos acessar um índice de um array que está fora do intervalo válido de índices. */
}
