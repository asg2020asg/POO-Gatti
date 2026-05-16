package Atv13_CalcularArea;

public class Main {
    public static void main(String[] args) {
        Forma r1= new Retangulo(5,4);
        Forma c1= new Circulo(5);
        r1.calcularArea();
        c1.calcularArea();
    }
}
