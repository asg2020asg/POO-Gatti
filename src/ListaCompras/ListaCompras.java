package ListaCompras;

import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<Item> itens;
    public ListaCompras() {
        itens = new ArrayList<>();
    }
    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println("Item adicionado: "+item.getNome());
    }
    public void removerItem(Item item) {
        itens.remove(item);
    }
    public void mostraLista() {
        System.out.println("Lista de Compras:");
        for (Item item : itens) {
            System.out.println("- " + item .getNome());
        }
    }
}
