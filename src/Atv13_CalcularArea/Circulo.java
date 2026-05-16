package Atv13_CalcularArea;

public class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * Math.pow(raio,2);
        System.out.println("Area do Circulo: " + areaCirculo);
    }
}
