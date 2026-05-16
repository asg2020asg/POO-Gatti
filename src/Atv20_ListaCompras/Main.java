package Atv20_ListaCompras;

public class Main {
    public static void main(String[] args) {
       ListaCompras lista = new ListaCompras();
       Item item1 = new Item("Arroz");
       Item item2 = new Item("Feijão");
       Item item3 = new Item("Macarrão");

       lista.adicionarItem(item1);
       lista.adicionarItem(item2);
       lista.adicionarItem(item3);

       lista.mostraLista();

       lista.removerItem(item2);

       System.out.println("\nApós remover um item: ");
       lista.mostraLista();

    }
}
