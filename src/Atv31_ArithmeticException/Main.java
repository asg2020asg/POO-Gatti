package Atv31_ArithmeticException;

public class Main {
    public static void main(String[] args) {
        Divisao cal1 = new Divisao(10, 4);

        try {
            cal1.dividir();
            cal1.exibirDivisao();
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");

        }
    }
}