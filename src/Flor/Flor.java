package Flor;

public class Flor {
    public String nome;
    public String cor;
    public boolean possuiPerfume;
    public Flor(String nome, String cor, boolean possuiPerfume){
        this.nome = nome;
        this.cor = cor;
        this.possuiPerfume = possuiPerfume;
    }
    public void mostrarDados(){
        this.possuiPerfume = true;
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Possui perfume: " + (possuiPerfume ? "Sim" : "Nao"));
    }
}
