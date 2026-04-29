package Escola;

public class Secretaria extends Funcionario implements PresencaRegistravel{
    private String turno;
    public Secretaria(String nome, String turno){
        super(nome);
        this.turno= turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    public String getTurno (){
        return turno;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+nome);
    }
    public void organizarDocumentos(){
        System.out.println(getNome()+ " está organizando os documentos no turno "+turno);
    }
    public void registrarPresenca(){
        System.out.println("Presença registrada para a(o) secretaria(o) "+getNome());
    }
}
