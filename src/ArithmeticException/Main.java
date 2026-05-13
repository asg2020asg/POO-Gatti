package ArithmeticException;

public class Main {
    public static void main(String[] args) {
        Divisao cal1 = new Divisao(10, 4);

        try {
            cal1.dividir();
            // Esta linha só executa se a divisão acima der certo:
            cal1.exibirDivisao();
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
            // Opcional: mostrar a mensagem técnica do erro
            // System.out.println("Detalhe: " + e.getMessage());
        }
    }
}