package Equipamentos;

public class ProjetorInteligente implements Conectavel, Ligavel {
    public void conectarInternet() {
        System.out.println("Projetor conectado à internet.");
    }
    public void ligar() {
        System.out.println("Projetor ligado com sucesso.");
    }
}
