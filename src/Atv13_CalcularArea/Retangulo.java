package Atv13_CalcularArea;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public void calcularArea() {
        double areaRetangulo = largura * altura;
        System.out.println("Area do retangulo: " + areaRetangulo);
    }
}
