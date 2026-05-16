package Atv15_SistemaPagamento;

public class Pix extends Pagamento {
    public Pix( double valor) {
        super(valor);
    }
    @Override
    public void processarPagamento() {
        this.valor = valor;
        System.out.println("Pagamento de "+valor+" realizado via pix!");
    }
}
