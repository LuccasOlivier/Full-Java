package Kenumeracao;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    // Construtor
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
    
    //ToString
    @Override
    public String toString(){
        return "Nome: " + this.nome + ", tipo cliente: " + this.tipoCliente + ", tipo pagamento: " + this.tipoPagamento;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente gTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento GetTipoPagamento(){
        return tipoPagamento;
    }
}