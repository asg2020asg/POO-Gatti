package Porta;

public class Main {
    public static void main(String[] args) {
        PortaAutomatico s1= new PortaSala();
        s1.abrirPorta();
        PortaAutomatico l1= new PortaLaboratorio();
        l1.abrirPorta();
    }
}
