package Associacao_CarroPessoa;

public class Pessoa {
    private String nome;
    public Pessoa(String nome){
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void usarCarro(Carro carro){
        System.out.println(nome+ " está usando o carro:");
        carro.dirigir();
    }
}
