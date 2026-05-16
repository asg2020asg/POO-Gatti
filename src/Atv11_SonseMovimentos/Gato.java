package Atv11_SonseMovimentos;

public class Gato extends Animal {
    private String corPelagem;
    public Gato(String nome,String corPelagem){
        super(nome);
        this.corPelagem = corPelagem;
    }
    public String getCorPelagem() {
        return corPelagem;
    }
    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + ": Miau!");
    }
    @Override
    public void mover(){
        System.out.println(nome + " está saltando agilmente.");
    }
}
