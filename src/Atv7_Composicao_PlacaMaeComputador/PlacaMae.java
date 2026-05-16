package Atv7_Composicao_PlacaMaeComputador;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoDeMemoriaSuportada;
    public PlacaMae(String fabricante, String chipset, int numeroSlots, String tipoDeMemoriaSuportada) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoDeMemoriaSuportada = tipoDeMemoriaSuportada;
    }
    public void exibirinformacoes(){
        System.out.println("===Informações da Placa Mãe===");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Número de Slots: " + numeroSlots);
        System.out.println("Tipo de Memória Suportada: " + tipoDeMemoriaSuportada);
    }
    public void atualizarChipset(String novoChipset){
        this.chipset = novoChipset;
    }
    public void adicionarSlot(){
        this.numeroSlots++;
    }
    public void definirTipoMemoria(String tipo){
        this.tipoDeMemoriaSuportada = tipo;
    }
}
