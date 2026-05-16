package Atv6_Agregacao_CursoInstrutor;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int experienciaAno;
    public Instrutor (String nome, String formacao, String email, int experienciaAno) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experienciaAno = experienciaAno;
    }
    public String getNome() {
        return nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public String getEmail() {
        return email;
    }
    public int getExperienciaAno() {
        return experienciaAno;
    }
    public void exibirInstrutor (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Formacao: " + this.formacao);
        System.out.println("Email: " + this.email);
        System.out.println("Experiencia ano: " + this.experienciaAno+" anos");
    }
    public void aplicarAvaliacao (String cursoNome){
        System.out.println(nome+" aplicou uma avaliação no curso: " +cursoNome);
    }
    public void responderDuvidas (String duvida){
        System.out.println(nome+ "tirou uma dúvida de: " +duvida);
    }
    public void criarApoio (String titulo){
        System.out.println(nome+ "criou o material: " +titulo);
    }
    public void agendarLive (String dataHora){
        System.out.println("Live agendada por "+nome + "para: "  +dataHora);
    }
}
