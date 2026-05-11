package Agregacao_CursoInstrutor;

public class Curso {
    private String nome;
    private String cargaHoraria;
    private String nivel;
    private String descricao;
    private Instrutor intrutor1;
    private Instrutor intrutor2;

    public Curso(String nome, String cargaHoraria, String nivel, String descricao, Instrutor intrutor1, Instrutor intrutor2){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.intrutor1 = intrutor1;
        this.intrutor2 = intrutor2;
    }

}
