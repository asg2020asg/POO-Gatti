package Associacao_EmprestimoLivro;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataRetirada, LocalDate dataDevolucao){
        this.livro = livro;
        this.leitor = leitor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        livro.marcarComoEmprestado();
        leitor.confirmarEmprestimo();
    }
    public void exibirResumo(){
        System.out.println("Empréstimo:");
        leitor.exibirInformacoes();
        livro.exibirInformacoes();
        System.out.println("Retirada: "+dataRetirada);
        System.out.println("Devolução: "+dataDevolucao);
    }
    public void devolverLivro(){
        livro.marcarComoDisponivel();
        System.out.println("Livro devolvido:");
    }
    public boolean estaAtrasado(LocalDate hoje){
        return hoje.isAfter(dataDevolucao);
    }

}
