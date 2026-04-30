package Associacao_EmprestimoLivro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Leitor l1= new Leitor("Maria Silva",2021001, "mariasilva@gmail.com","+55 (94)98191-1783");
        Livro l2=new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", " 978-3-16-148410-B");

        LocalDate hoje = LocalDate.now();
        LocalDate devolucao = hoje.plusDays(7);

        Emprestimo emp= new Emprestimo( l2, l1,hoje, devolucao);
        l2.exibirInformacoes();
        emp.exibirResumo();

        System.out.println("Está atrasado? "+(emp.estaAtrasado(LocalDate.now())?"Sim":"Nao"));

        emp.devolverLivro();
        l2.exibirInformacoes();

        System.out.println("Livro está emprestado? " +(l2.isEmprestado()?"Sim":"Nao"));
    }
}
