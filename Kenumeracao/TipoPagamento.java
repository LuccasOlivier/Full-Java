package Kenumeracao;

public enum TipoPagamento {
    DEBITO {
        @Override // Sobrescrita de método
        public double CalcularDesconto(double valor) {
            return valor * 0.1; // 10% de desconto.
        }
    },
    CREDITO {
        @Override // Sobrescrita de método
        public double CalcularDesconto(double valor) {
            return valor * 0.05; // 5% de desconto.
        }
    };

    // Método abstrato definir desconto
    public abstract double CalcularDesconto(double valor); 
}
