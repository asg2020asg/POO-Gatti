package Atv11_SonseMovimentos;

public class Main {
    public static void main(String[] args) {
        Animal a1= new Papagaio("Loro","Verde");
        Animal a2= new Gato("Mingal","Branca");
        Animal a3= new Vaca("Bingo",true);
        Animal[] animais = {a1,a2,a3};
        for (Animal animal : animais){
            animal.emitirSom();
            animal.mover();

        }
        Papagaio a4=new Papagaio("Loro","Verde");
        a4.emitirSom("Olá Humanos!");
    }
}
