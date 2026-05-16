package Atv6_Agregacao_CursoInstrutor;

public class Curso {
    private String cursoNome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private Instrutor instrutor1;
    private Instrutor instrutor2;

    public Curso(String cursoNome, int cargaHoraria, String nivel, String descricao){
        this.cursoNome = cursoNome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
    }
    public String getCursoNome(){
       return cursoNome;
    }
    public void associarInstrutor (Instrutor instrutor){
        if(this.instrutor1 == null){
            this.instrutor1 = instrutor;
        }
        if(this.instrutor2 == null){
            this.instrutor2 = instrutor;
        }
        else {
            System.out.println("Não é possível adicionar mais instrutores a este curso.");
        }
    }
    public void exibirCurso(){
        System.out.println("Curso: "+cursoNome);
        System.out.println("Carga Horaria: "+cargaHoraria+ " horas");
        System.out.println("Nivel: "+nivel);
        System.out.println("Descricao: "+descricao);
        if (instrutor1 != null) instrutor1.exibirInstrutor();
        if (instrutor2 != null) instrutor2.exibirInstrutor();
    }
}
