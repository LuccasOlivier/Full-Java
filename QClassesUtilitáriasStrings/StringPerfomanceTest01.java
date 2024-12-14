package QClassesUtilitáriasStrings;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String sem utilizar StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String utilizando StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String utilizando StringBuffer: " + (fim - inicio) + "ms");

    }

    // Método sem utilizar o StringBuilder
    public static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto = texto + i;
        }
    }

    // Método utilizando StringBuilder
    public static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    // Método utilizando StringBuffer
    public static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
