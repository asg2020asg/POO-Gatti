package Atv7_Composicao_PlacaMaeComputador;

public class Main {
    public static void main(String[] args) {
        Computador c1= new Computador("Dell","Inspiron 15","Intel Core i5",8,"Asus","B560",4,"DDR4");
        c1.exibirComputadorCompleto();
        System.out.println("atualização em andamento...");
        c1.atualizarProcessador("Intel Core i7");
        c1.expandirMemoria(8);
        c1.atualizarPlacaMae("Z590","DDR5");
        c1.exibirComputadorCompleto();
    }
}
