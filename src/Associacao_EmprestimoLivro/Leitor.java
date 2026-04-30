package Associacao_EmprestimoLivro;

public class Leitor {
    private String nome;
    private int matricula;
    private String email;
    private String telefone;
    public Leitor(String nome, int matricula, String email, String telefone){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public void atualizarContanto(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }
    public void exibirInformacoes(){
        System.out.println("Leitor: "+nome);
        System.out.println("Matricula: "+matricula);
    }
    public void confirmarEmprestimo(){
        System.out.println(nome+ " relizou o emprestimo do livro: ");
    }


}
