package Atv11_SonseMovimentos;

public class Papagaio extends Animal{
    private String corPena;
    public Papagaio(String nome, String corPena){
        super(nome);
        this.corPena = corPena;
    }
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + ": Curupaco!");
    }
    @Override
    public void mover(){
        System.out.println(nome + " está voando pelos céus.");
    }
    public void emitirSom(String frase){
        System.out.println(nome + " repetiu: " + frase);
    }
}
