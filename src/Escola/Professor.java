package Escola;

public class Professor extends Funcionario implements PresencaRegistravel{
    private String disciplina;
    public Professor (String nome, String disciplina){
        super(nome);
        this.disciplina = disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+nome);
    }
    public void lecionar(){
        System.out.println(getNome()+" está lecionando a disciplina "+disciplina);
    }
    public void registrarPresenca(){
        System.out.println("Presenca registrada para o(a) professor(a) "+getNome());
    }
}
