package Atv7_Composicao_PlacaMaeComputador;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRam;
    private PlacaMae placaMae;
    public Computador(String marca, String modelo, String processador, int memoriaRam, String fabricante, String chipset, int numeroSlots, String tipoDeMemoriaSuportada){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.placaMae= new PlacaMae(fabricante,chipset,numeroSlots,tipoDeMemoriaSuportada);
    }
    public void exibirComputadorCompleto(){
        System.out.println("===Informações do Computador===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria RAM: " + this.memoriaRam + "GB");
        placaMae.exibirinformacoes();
    }
    public void atualizarProcessador(String novoprocessador){
        processador = novoprocessador;
        System.out.println("Processador atualizado para: " + processador);
    }
    public void expandirMemoria(int adicional){
        memoriaRam += adicional;
        System.out.println("Memoria expandida. Total atual: " + memoriaRam + "GB");
    }
    public void atualizarPlacaMae(String novoChipset, String novoTipoMemoria){
        placaMae.atualizarChipset(novoChipset);
        placaMae.definirTipoMemoria(novoTipoMemoria);
        System.out.println("Chipset atualizado para: " + novoChipset);
        System.out.println("Tipo de memória atualizado para: " + novoTipoMemoria);
    }
}
