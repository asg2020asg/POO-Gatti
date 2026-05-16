package Atv21_AgendaContatos;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato("Ana");
        Contato c2 = new Contato("Carlos");
        Contato c3 = new Contato("Juliana");
        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);

        agenda.listarContatos();

        agenda.removerContato(c2);

        agenda.listarContatos();
    }
}