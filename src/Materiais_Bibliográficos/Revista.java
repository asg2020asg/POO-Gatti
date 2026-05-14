package Materiais_Bibliográficos;

public class Revista extends MaterialBibliografico{
    private int mesAnoEdicao;
    public Revista(String titulo,String codigo, int mesAnoEdicaonoEdicao){
        super(titulo,codigo);
        this.mesAnoEdicao = mesAnoEdicao;
    }
    public int getMesAnoEdicao() {
        return mesAnoEdicao;
    }
    public void setMesAnoEdicao(int mesAnoEdicao) {
        this.mesAnoEdicao = mesAnoEdicao;
    }
    @Override
    public void emprestar(){
    System.out.println("Revista Emprestado da clase Base Material bibliográfico" + getTitulo());
    }
}
