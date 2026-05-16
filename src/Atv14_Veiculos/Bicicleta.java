package Atv14_Veiculos;

public class Bicicleta extends Veiculo {
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A bicicleta está movendo com pedal");
    }
}
