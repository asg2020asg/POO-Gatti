package Agregacao_CursoInstrutor;

public class Main {
    public static void main(String[] args) {
        Instrutor instrutor1= new Instrutor("Ana Ribeiro","Engenharia da Computação", "ana@curso.com", 8);
        Curso curso1= new Curso("Programação em Java",60, "Intermediário", "Curso focado em lógica, orientação ao objeto e prática com Java");
        curso1.associarInstrutor(instrutor1);
        curso1.exibirCurso();
        instrutor1.aplicarAvaliacao(curso1.getCursoNome());
        instrutor1.agendarLive("10/05/2025 às 19h");
    }
}
