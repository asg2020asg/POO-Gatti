package Escola;

public class Diretor extends Funcionario{
    private String setor;
    public Diretor (String nome, String setor){
        super(nome);
        this.setor = setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+nome);
    }
    public void tomarDecisao(){
        System.out.println(getNome()+" está tomando decisões no setor "+setor);
    }
}
