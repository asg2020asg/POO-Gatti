package Atv12_Funcionario;

public class Clt extends Funcionario{
    public  Clt(String nome,double salarioBase) {
        super(nome,salarioBase);
    }
    @Override
    public void calcularSalario(){
        double salarioFinal = salarioBase*2;
        System.out.println("Salario de "+nome + ": " + salarioFinal);
    }
}
