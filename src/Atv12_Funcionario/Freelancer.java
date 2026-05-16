package Atv12_Funcionario;

public class Freelancer extends Funcionario{
    public Freelancer(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public void calcularSalario(){
        double salarioFinal = salarioBase*3;
        System.out.println("Salario de "+nome + ": " + salarioFinal);
    }
}
