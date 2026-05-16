package Atv14_Veiculos;

public abstract class Veiculo {
    protected String modelo;
    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public abstract void mover();
}
