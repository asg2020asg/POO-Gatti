package Atv15_SistemaPagamento;

public class Cartao extends Pagamento{
    public Cartao(double valor) {
        super(valor);
    }
    @Override
    public void processarPagamento() {
        double valorCartao = valor+ (valor * 0.1);
        System.out.println("Pagamento de "+valorCartao+" realizado com cartão!");
    }
}
