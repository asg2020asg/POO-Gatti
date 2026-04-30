package Associacao_EmprestimoLivro;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    public String getTitulo() {
        return titulo;
    }


    public void marcarComoEmprestado(){
        this.emprestado = true;
    }
    public void marcarComoDisponivel(){
        this.emprestado = false;
    }
    public boolean isEmprestado(){
        return emprestado;
    }
    public void exibirInformacoes(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("ISBN: "+isbn);
    }
}
