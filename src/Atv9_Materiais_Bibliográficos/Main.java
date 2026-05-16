package Atv9_Materiais_Bibliográficos;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Engenharia de Software", "5421A", "Carlos", "142314B");
        Revista r1 = new Revista("Engenharia de Software", "1234C", 2025);
        MidiaDigital md1 = new MidiaDigital("TCC", "1234D", "txt", 100);
        l1.emprestar();
        r1.emprestar();
        md1.emprestar();
    }
}
