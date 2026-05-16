package Atv31_ArithmeticException;

public class Divisao {
    private double num1;
    private double num2;
    private double div;
    public Divisao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void dividir (){

        this.div = this.num1 / this.num2;
    }
    public void exibirDivisao(){

        System.out.println("O resultado da divisão é: "+this.div);
    }
}
