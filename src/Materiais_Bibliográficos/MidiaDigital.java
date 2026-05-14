package Materiais_Bibliográficos;

public class MidiaDigital extends MaterialBibliografico{
    private String formatoArquivo;
    private int tamanhoMb;
    private int totalDowloads;
    public MidiaDigital(String titulo, String codigo, String formatoArquivo, int tamanhoMb){
        super(titulo, codigo);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoMb = tamanhoMb;
        this.totalDowloads = 0;
    }
    public  String getFormatoArquivo() {
        return formatoArquivo;
    }
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    public int getTamanhoMb() {
        return tamanhoMb;
    }
    public  void setTamanhoMb(int tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }
    public int getTotalDowloads() {
        return totalDowloads;
    }
    public void setTotalDowloads(int totalDowloads) {
        this.totalDowloads = totalDowloads;
    }
    @Override
    public void emprestar(){
        totalDowloads++;
        System.out.println("Midia digital emprestado da classe derivada Midia Digital: "+ getTitulo());
        System.out.println("Quantidade de dowloads: " + totalDowloads);
    }
}
