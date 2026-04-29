package Escola;

public class Main {
    public static void main(String[] args){
        Diretor d1= new Diretor("Carlos", "Administração");
        d1.exibirDados();
        d1.tomarDecisao();
        Professor p1= new Professor("Ana","Matemática");
        p1.exibirDados();
        p1.lecionar();
        p1.registrarPresenca();
        Secretaria s1= new Secretaria("Bruna","Manhã");
        s1.exibirDados();
        s1.organizarDocumentos();
        s1.registrarPresenca();
        Terceirizado t1= new Terceirizado("José");
        t1.executarServico();
        t1.registrarPresenca();
    }
}
