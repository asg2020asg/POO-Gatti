package Atv11_SonseMovimentos;

public class Vaca extends Animal{
    private boolean temChifres;
    public Vaca(String nome, boolean temChifres){
        super(nome);
        this.temChifres = temChifres;
    }
    public boolean getTemChifres(){
        return temChifres;
    }
    public void setTemChifres(boolean temChifres){
        this.temChifres = temChifres;
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + ": Muuu!");
    }
    @Override
    public void mover(){
        System.out.println(nome + " está andando pelo pasto.");
    }
}
