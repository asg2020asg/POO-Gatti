package Atv10_Herança_Animal;

public class Main {
    public static void main(String[] args) {
        Gato g1= new Gato("Mimi",5,"Branca");
        Cachorro c1=new Cachorro("Rex",7,"Grande");
        g1.emitirSom();
        g1.emitirSom("Miau");
        g1.brincar();
        g1.brincar("Bolinha");
        c1.emitirSom();
        c1.emitirSom("Au-Au");
        c1.correr();
        c1.correr(200);
    }
}
