package Atv15_SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento c1 = new Cartao(153);
        Pagamento p1 = new Pix(153);
        c1.processarPagamento();
        p1.processarPagamento();
    }
}
