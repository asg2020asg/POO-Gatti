package Atv14_Veiculos;

public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("O carro está se movendo com motor");
    }
}
