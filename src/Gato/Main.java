package Gato;

public class Main {
    public static void main(String[] args) {
        Gato g1= new Gato("Sushi", 3, false);
        g1.comer();
        g1.dormir();
        Gato g2= new Gato("Cachaça",1, false);
        g2.comer();
        g2.comer();
    }
}
